import keyboard
import time

# get the MIDI text file name from the user
filename = input("Enter the name of the MIDI text file: ")

# open the file
with open(filename, "r") as file:

    # get the playback speed from the first line
    first_line = file.readline().strip()
    playback_speed = float(first_line.split("=")[1])

    # loop through each line in the file
    for line in file:

        # skip any empty lines
        if not line.strip():
            continue

        # split the line into its component parts
        line = line.strip().split()

        # convert the time delta to seconds based on the playback speed
        time_delta = float(line[0]) / playback_speed

        # check if the line is a note on event
        if line[1] == "on":

            # get the note number and velocity
            note_number = int(line[2])
            velocity = int(line[3])

            # press the key
            keyboard.press(str(note_number))

            # wait for the specified duration
            time.sleep(time_delta)

            # release the key
            keyboard.release(str(note_number))

        # check if the line is a note off event
        elif line[1] == "off":

            # get the note number
            note_number = int(line[2])

            # release the key
            keyboard.release(str(note_number))

        # if the line is not a note on or note off event, skip it
        else:
            continue