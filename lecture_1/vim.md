## How to use vim

##### Why you should learn vim (or emacs)
- vim (or vi) is on almost every Linux and Unix installation
- vim is usually run from inside a shell - which means you can use it while working remotely (and you will need to do this at some point in your career)
- most IDEs have a vim mode - including Eclipse and Visual Studio
- vim will improve your productivity by removing the mouse and arrow keys from your workflow - it is much quicker to code when you don't remove your fingers from the home row
- vim is lightweight and can be used for editing anything
##### Limitations
- no autocomplete (by default), no automatic type checking (use an IDE for that)
- you will likely have to customize it in order for it to be useful to you
##### Articles 
- [Learn Vim Progressively](http://yannesposito.com/Scratch/en/blog/Learn-Vim-Progressively/)
- [Vimtutor](http://linuxcommand.org/man_pages/vimtutor1.html) - run `vimtutor` inside your shell for an interactive demo
##### Quick tutorial
- load up [bins.java](/bins.java) in vim
- Notice that this file will not compile. There are two major problems - the copyright notice is not commented out, and the import statements do not contain "import" and have an extra semicolon at the bottom.
- Say we don't need the copyright notice - how would we get rid of it in Eclipse? Probably by clicking on the top of the notice, shift clicking on the bottom, and hitting `backspace`.
- In vim there is a better way. To remove the first 21 lines of code, simply type `21dd` while in normal mode. This means, "repeat 21 times, delete, until next line". If we want to delete 6 words, we type `6dw`, which translates to "repeat 6 times, delete, until end of word." 

- Now we want to fix the import statements. We can enter insert mode by typing `i`, and then simply type "import " to add the import statement. Press `escape` to exit insert mode.
- How can we make this more efficient than typing import for every line? One way is by using the dot, or repeat, operator `.`. navigate to the next line, press `.`, and your previous command will enter. Since your previous command was to insert the text "import ", this will automatically appear.
- Another is to use macros. Go to the first line of imports, and press `qr` to start recording in the "r" register. Again, type `i` and the "import " statement, then hit `escape`. We can use this to also get rid of the trailing character. Vim has quite a few shortcuts for moving around. Type `$` to go to the end of the line, and hit `x` once to remove the extra semicolon. Then hit `^` to go back to the beginning of the line.
- To end the macro, hit `j` to go to the next line and then hit `q` again to stop recording. Now we can use our macro, which we saved in the "r" register by typing `qr` (you can use almost any key register to save it). Type `@r` to use the macro. As you can see, all of your keystokes during the macro were recorded and are simply repeated. If you want to repeat the macro 4 more times to finish off the import statements, hit `4@r`.
##### Takeaways
- You should learn at least the basics of vim so that you can survive when editing text remotely.
- If you want to truly learn vim, run it in a terminal and disconnect your mouse for a week
- After an initial investment, vim WILL improve your productivity
