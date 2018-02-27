import java.io.IOException;

import java.io.IOException;

    public class First {

        public static void main(String[] args)  {
            try {
                StringProcessor stringProcessor = new StringProcessor();
                String text = stringProcessor.readInputText();
                text = stringProcessor.processText(text);
                stringProcessor.showResult(text);
            }catch(IOException e){

            }
        }
    }