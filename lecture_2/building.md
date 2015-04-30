## Building software from source

* Read chapter 16, How Linux Works (2nd edition)
* Also see [this page](https://www.gnu.org/software/automake/manual/html_node/GNU-Build-System.html#GNU-Build-System) from the GNU guide about GNU configuration tools.

##### Packaging

* Read the Debian package maintainers guide [here](https://www.debian.org/doc/manuals/maint-guide/start.en.html).
* Packaging works differently on different Linux systems, because of technical and organizational differences.
* Technical:
    * Debian format vs RPM vs other (these are mutually incompatible, but it is possible to convert a package from one format to another)
* Organizational:
    * Sometimes package management is done by volunteers, sometimes by paid employees. Example: Debian is maintained by volunteers, Ubuntu is maintained by the company Canonical
* Anyone can make a .deb archive that is installable, but getting it into the repository so that other users can do a simple `sudo apt-get install` is more difficult - requires becoming a part of the community

##### Dev packages in distro repositories

* Many packages (usually code libraries) in package managers have a corresponding development package, usually suffixed '-dev' on Ubuntu. These contain the header files for the library, which are not required to use the library but are required to compile new software using the library.
* In order to use a distro-provided library in your own source code (without changing that library) you will have to install the dev package.

