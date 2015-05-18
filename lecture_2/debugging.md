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
