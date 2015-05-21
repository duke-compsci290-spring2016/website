## Linux command line

* How Linux Works, chapter 2

##### The parts

* The terminal is the GUI of the command line - the window it's contained in. One common terminal is gnome-terminal, though they are mostly interchangeable
* The shell is the program that runs inside. It takes user input and outputs the text

##### What happens when I type `ls` on a Bash command prompt? (an abbreviated explanation)

* `ls` is the list files command
* First, the shell parses the user input. It sees `ls` and no arguments, so it needs to find the `ls` program.
* Bash looks in a few pre-defined places for an executable named `ls`. It should find it in `/bin`, and probably in `/usr/bin` as well (`bin` is short for `binary` or runnable executable).
* Bash keeps track of shell variables, which are simple key-value string pairs. These variables exist for configuration purposes, and programs can access these shell variables. You can make programs modular by using shell variables for configuration instead of having to recompile the program.
* One example of a shell variable is `$PATH`. If you type `echo $PATH` in Bash, you will see a listing of folders, separated by colons. These folders are all the places that Bash looks for the executables, in order of precedence.
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
* `wc [file]` - get the word count of the file
* `tar -xf [file]` - extract tar file (the `x` stands for extract). Note that including the `z` option extracts files from a gzipped (or compressed) archive.
* `tar -cf [filename] [files to include]` - create tar file with filename, including the files given (the `c` stands for create). The `z` option creates a gzipped compressed archive.

##### Globbing

* You can specify wildcards with your commands that will act on multiple files. The wildcard character is `*`.
* For example, to remove all files in a directory, use `rm *`. To remove all files with names starting with `test_`, use `rm test_*`
* This can be very dangerous, because you haven't written out exactly which files you are applying your actions on. Use with caution!

##### The Bash command line is really powerful

* The command line is based around composition - making small programs that can be combined to produce powerful effects.
* This is where the concept of streams comes in. Calling `diff [file1] [file2] | wc -l` uses the Unix pipe syntax to pipe a stream of data from the diff command to the wordcount command. This particular command gives the number of lines in the diff of two files. (See How Linux Works, chapter 2)
* [More here on how powerful the shell is](http://www.leancrew.com/all-this/2011/12/more-shell-less-egg/)

