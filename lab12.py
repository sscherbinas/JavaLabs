import re

pattern = r"\S+\s-\s-\s\[(?:(?:08\/Mar\/2004:(?:0[7-9]|1\d|2\d):\d\d:\d\d)|09\/Mar\/2004:\d\d:\d\d:\d\d|10\/Mar\/2004:(?:00:\d\d:\d\d|01:[0-4]\d:[0-5]\d))\s\S+\]\s(?:\S+\s){3}200\s\S+"
read_lines = 0
number_of_matched_requests = 0

with open("access_log", encoding="utf-8") as file:
    for line in file:
        read_lines += 1
        if re.match(pattern, line):
            number_of_matched_requests += 1
            print(re.findall(pattern, line))

print("\nNumber of all read lines: %d" % read_lines)
print("\nNumber of all found successful requests: %d" % number_of_matched_requests)
