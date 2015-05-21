## Debugging

##### Why do I need to debug?

* If you've made it to this class, you probably understand that most of your time is spent fixing bugs in old code, not writing new code.

##### Yes, but, why do I need to learn how to debug now?

* First, to refresh your memory about debugging C code. Many open source projects and libraries are written in C, and the ones that are not probably depend on a C library. Linux is also written in C, and sometimes (very, very occasionally) the bug you encounter can be a kernel bug.
* Second, because you are about to make your first open-source contribution (on the second day of class! imagine that!). Ok, it's not a real open-source program, but you have to submit a patch just as you would with a real project.

##### The project

* Today we will debug an example project written in C. In the previous lecture, you learned about the `wc` Unix utility, which is used to calculate the word count, line count, and character count of a file. We have a simpler version, one that reads from standard input (`stdin`) instead of a file.
* See chapter 2 (2.3 and 2.14) of "How Linux Works" (2nd ed) for a deeper explanation of how standard input and other streams work.
* The project can be found at [https://github.com/duke-compsci409-spring2016/wordcount](https://github.com/duke-compsci409-spring2016/wordcount)

##### Bug report

* Fixing a bug always starts with a bug report. Here is the bug report that you will have to fix: [https://github.com/duke-compsci409-spring2016/wordcount/issues/1](https://github.com/duke-compsci409-spring2016/wordcount/issues/1)
* There are multiple things wrong with this program, and we will try to fix them all.

##### Building the project

* As you can see, this is a project that can be installed via GNU Autotools. So after cloning, run the included `autogen.sh`, then `./configure` and `make`. There is no need to `make install` this program, since you don't need to use it outside of the included directory.
* You should have a `wordcount` executable in the git repository. You can run this with the `test.txt` file by typing in `./wordcount --printfoo < test.txt` to confirm the problem on your machine.
    * `--printfoo` is the argument to wordcount. The `<` character reads a file and directs the input to the program
* The first step to tackling a problem is always to reproduce the bug. Attempting to fix the bug without confirming that you see it as well is a recipe for disaster!

##### Debugging tools

* valgrind - a tool for memory profiling. If you run valgrind on `wordcount` it should find no errors, since no heap allocations are made in this program.
* gdb - a debugger. You can see the output at every line
* strace - system tracer, tracks (system) kernel calls that a programs makes
* ltrace - library tracer, tracks calls to shared libraries that a program makes
* log files - many logs are contained in /var/log. There is also `dmesg`, a utility that allows you to view kernel event logs.

##### How to use GDB

* GDB can be tricky - typing a program exactly as you would in the shell may not work.
* You can start GDB simply by running `gdb` (if it is not installed, use `apt-get` to install it).
* Once you've started GDB, you can type `help` to get a help listing or `help [command]` to get an explanation of a particular command.
* You can type `quit` to exit GDB.

Here is how to use GDB on `wordcount`:

* Start `gdb ./wordcount` to load GDB with the symbols for wordcount. If we did not run GDB with the `./wordcount` argument, it would not know which program we wanted to debug.
* We can set a breakpoint, or a place where the execution will stop, allowing us to examine the program. Set a breakpoint at line 20 by typing `break 20`.
* Now type `run --printfoo < test.txt`. You should see line 20.
* Try printing a value - how about `argc`? `argc` is short for "argument count." If you type `print argc` it should come up with 2 as the answer.
    * But wait - we only had one command line argument, `--printfoo`! Well, there is an implicit first argument - the path of the program being run. Try running `print argv[0]` and `print argv[1]` to see the two arguments.
* Now we can step through the program using `next`. This will execute the next instruction.

##### How to debug (readings)

* [Debugging small programs](http://ericlippert.com/2014/03/05/how-to-debug-small-programs/)
* [Debugging using GDB](http://www.thegeekstuff.com/2010/03/debug-c-program-using-gdb/)

##### Debugging checklist

Answer these questions before submitting a patch for a fix.

* Have you confirmed the problem on your own machine?
* Have you actually fixed the problem?
* Have you written a test for the bug? (if the project has tests)
* Has your fix broked any other parts of the program?
* Are all tests passing?
* Have you tested your fix on multiple machines? (for some major bugs)

##### Your task

* Now you must use these tools (mainly GDB) and your own skills to solve the bug report.
* Once you have verified the problem is solved, create a patch file by running `git format-patch master --stdout > fix.patch`.

#### Deliverables

You should turn in (in your personal wordcount activity repository):

* The output from running valgrind on the unmodified `wordcount` with the given `test.txt` script.
* The output from running `strace` on `wordcount`.
* The output from running `ltrace` on `wordcount`.
* The correction for the `wordcount` program, in patch format.

