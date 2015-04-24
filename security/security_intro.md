## Introduction to security of open-source software

##### Topics

* What does security mean?
* The reliance of other projects on open-source software (GPG, OpenSSL)
* Linux packaging
* Open source compiler hacking

##### Introduction

* Security can mean a few different things:
    * users can trust the program not to do anything malicious (steal or delete information)
    * users trust that the program does not have exploits that allow others to do anything malicious

* If we have the source for a program, we can examine it - which means we may be able to tell whether it does something malicious or not
* If a program has a bug, anyone can examine it, find it, and send in a patch for it
* But is proprietary software less safe?
* Problem: most of the time even the people who wrote the code can't tell whether there's a bug or exploitable feature
* Problem: if users can find bugs, so can hackers - they can examine the source easily
* Problem: malicious contributors can submit intentional bugs
    * This is not a theoretical problem - [link](http://www.infoq.com/news/2013/10/Linux-Backdoor)

##### Security through openness vs security through obscurity

* Security through openness: allowing everyone to see and use the software will make sure bugs are found and fixed
    * [Kerckhoffs's principle](https://en.wikipedia.org/wiki/Kerckhoffs%27s_principle): the only secure cryptographic systems are those which are secure if everything except the key is known 
* Security through obscurity: the details of the software (such as source code, APIs) are secret, so the way to hack the software is secret
* Everyone agrees that security through obscurity is a bad idea. But it's much easier, especially in proprietary software that is not expected to be open-sourced
* Designing a system that is secure even if the attacker knows all details is very difficult

##### How can we trust Linux packages?

* Remember, when we download a package (run `apt-get install`) we are downloading the pre-compiled binary, not the original source code
* How do we know that they match up, and that no malicious code has been inserted?
    * If we recompiled the source, we would be able to check
    * Problem: [Most of the time, compiling is non-deterministic](https://stackoverflow.com/questions/8927558/why-is-the-binary-output-not-equal-when-compiling-again)
* Another way is to just trust the developer - but we also need to trust that the given binary is one that the developer actually compiled
    * To check this, we can use checksums
    * Quick - check the md5 sum of test.txt by running `md5sum test.txt`
        * it should be c04ac7961120e535137ea81014a81c8d
        * (note that the MD5 sum is not very secure)
* So if we really want secure software, we should install from source? But wait...

##### The Ken Thompson Hack

* [Read this first](http://scienceblogs.com/goodmath/2007/04/15/strange-loops-dennis-ritchie-a/)
* What does this mean for programs that we have the source code for?
    * We have to have a compiler we trust, that was compiled with a compiler we trust, etc etc, all the way down to the original assembly that compiled it
* This was a proof of concept, and was never implemented. But trusting the source code itself is only one small part of trusting a program

##### Takeaways

* Open-source software can lead to better security, but they can have problems
* Most open-source projects have way more on their TODO list than they have contributors available to work on them, and security projects are not exceptions
* Most software is hackable in some way, shape, or form anyways. Open source can mitigate security vulnerabilities but it will never remove them

