## Linux and the command line

### Linux

* Linux is a kernel - a very low-level layer of abstraction over the hardware. It provides an API to programs
* Windows has a kernel, and OSX has a kernel (called Darwin)
* Most programs don't use these kernel APIs - they use a layer on top of it. In Windows, a popular API is .NET. In OSX, a popular layer is Cocoa. In Linux, a popular layer is GLib (which is used in the GNOME desktop).
* This is why Richard Stallman wants people to refer to Linux as GNU/Linux - because most Linux distributions are built on both the Linux kernel and GNU tools, which is a set of applications that make the Linux kernel useful. These applications include the GCC compiler and the GNU build system.
* Most Linux distributions are really complicated and made up of a lot of moving parts. This is a diagram of what software Debian Linux with the GNOME desktop will look like in a year or so:
![linux](linux.JPG)

##### Differences between Linux and Windows/OSX

* [Linux for the Windows user](http://linux.wikia.com/wiki/Linux_explained_to_the_Windows_user)
* If you use OSX with Homebrew and the command line, there isn't a huge change

##### Distribtions

* Distributions are just a collection of specific software and a Linux kernel
* Examples: Ubuntu, Debian, Fedora

* The software that is included is determined by the leaders of the distribution, who can also customize much of it
* This means that if you need to install a piece of software you usually download it from a repository owned by the distribution owners
* Unlike the classic way of installing OSX or Windows applications, most distributions let you install a piece of software with a simple command
** On Debian/Ubuntu: `sudo apt-get install python` to install python
** sudo - run with super-user privileges
** apt-get install - use the Aptitude package manager to install something
** python - name of the package to be installed

* Many distributions give users the choice of which type of desktop they use
* Most distributions are intended to be run out of the box

##### Desktops

* There are two major desktops (and many less popular ones): KDE and GNOME.
* They have different APIs and ways of representing GUIs
* These desktops are intended to be a complete collection of useful software, a GUI, and everything useful that the user sees, such as a login screen
* Because these desktops are abstracted, they don't even require the Linux kernel - they can be run on other types of kernels (such as BSD Unix)
* Most Linux distributions can run software intended for either type
