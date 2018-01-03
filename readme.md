# Conditional formattings are not copied

This project refers to JXLS2 [issue 89](https://bitbucket.org/leonate/jxls/issues/89/conditional-formattings-are-not-copied).

Template: ticket89.xlsx

In cell A2 there is a *conditional* formatting that gives every second row a grey background color. The JXLS 2.4.1 each command
does not stretch this format to all rows of the list. You will see in the output file that only the cell A2 is grey.

You can see some tips how to use Excel in neue_regel.png and formel.png. (German Excel version)

# Installation

* check out into Eclipse on Windows
* run Ant file build.xml (target eclipse) (maybe you need to modify build.xml)
* refresh project

# Usage

* run Ticket89.java
* refresh Eclipse project
* look at ticket89-output.xlsx
* but it should look like ticket89-result.xlsx