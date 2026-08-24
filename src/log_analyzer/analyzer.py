def read_log_entry():
    with open("data/sample.log", "r") as file:
        entry = {}
        for line in file:
            print(line)


print(read_log_entry())