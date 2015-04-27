## Linux command line

##### The parts

* The terminal is the GUI of the command line - the window it's contained in. One common terminal is gnome-terminal, though they are mostly interchangeable
* The shell is the program that runs inside. It takes user input and outputs the text

##### What happens when I type `ls` on a Bash command prompt? (an abbreviated explanation)

* `ls` is the list files command
* First, the shell parses the user input. It sees `ls` and no arguments, so it needs to find the `ls` program.
* Bash looks in a few pre-defined places for an executable named `ls`. It should find it in `/bin`, and probably in `/usr/bin` as well (`bin` is short for `binary` or runnable executable).
* Then it executes the `ls` program. The source code is [found here](http://git.savannah.gnu.org/cgit/coreutils.git/tree/src/ls.c) for the GNU tools version.
* The output is then printed on the command line.

##### Important commands you should already know

* `man [command]` - takes you to the man (manual page) of a command
* `ls` - list files
* `cd [dir]` - change directory
* `mv [src] [dst]` - move files from source to destination
* `cp [src] [dst]` - copy files from source to destination
* `rm [file]` - remove file (be careful with this - there is no confirmation and you can remove important system files)
* `mkdir [dirname]` - make a directory

##### More advanced commands

* `find -name [pattern]` - find files with filenames that match pattern
* `grep -r [pattern]` - search through files recursively to find lines matching the pattern
* `sort [file]` - sort lines in a file
* `diff [file1] [file2]` - diff two files (use `git diff` to diff branches or commits as well)
* `less [file]` - simple file viewer
* `head [file]` - output beginning of a file
* `tail [file]` - output end of a file

