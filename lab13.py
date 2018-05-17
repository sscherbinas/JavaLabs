from flask import Flask, abort
from flask_restful import Resource, fields, Api, reqparse, marshal

app = Flask(__name__, static_url_path="")
api = Api(app)

tours = [
    {
        'Id': 0,
        'duration': 0,
        'price': 0
    }
]

tours_fields = {
    'id': fields.Integer,
    'duration': fields.Integer,
    'price': fields.Integer
}


class Tour(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()
        self.reqparse.add_argument('id', type=int, required=True, help='No id provided', location='json')
        self.reqparse.add_argument('duration', type=int, location='json')
        self.reqparse.add_argument('price', type=int, location='json')
        super(Tour, self).__init__()

    def get(self, id):
        tour = [tour for tour in tours if tour.get('id') == id]
        if len(tour) == 0:
            abort(404)
        return {'Tour': marshal(tour[0], tours_fields)}

    def delete(self, id):
        tour = [tour for tour in tours if tour.get('id') == id]
        if len(tour) == 0:
            abort(404)
        return {'result': True}

    def put(self):
        args = self.reqparse.parse_args()
        tour = {
            'Id': tours[-1]['Id'] + 1,
            'id': args['id'],
            'duration': args['duration'],
            'price': args['price']
        }
        tours.append(tour)
        return {'Tour': marshal(tour, tours_fields)}, 201

    def post(self):
        args = self.reqparse.parse_args()
        tour = [tour for tour in tours if tour.get('id') == args['id']]
        if len(tour) == 0:
            abort(404)
        tour = tour[0]
        args = self.reqparse.parse_args()
        for k, v in args.items():
            if v is not None:
                tour[k] = v


api.add_resource(Tour, '/tours', endpoint='tours')
api.add_resource(Tour, '/tours/<int:id>', endpoint='tour')

if __name__ == '__main__':
    app.run(debug=True)
