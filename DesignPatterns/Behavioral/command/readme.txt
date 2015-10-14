**************definition***************
An Object is used to encapsulate all the information
needed to perform an action or trigger an event at a later time
(queuing or call back functionality)

It involves four terms
command, receiver, invoker and client

COMMAND
Encapsulates all the parameters for command execution
A command object knows about receiver and invokes a method of the receiver

RECEIVER
It does the work
Values for parameters of the receiver method are stored in the command

INVOKER
The invoker does not know anything about a concrete command, it knows only about command interface

CLIENT
Both an invoker object and several command objects are held by a client object. 
The client decides which commands to execute at which points. 
To execute a command, it passes the command object to the invoker object.


******************Use Cases**************
Multilevel Undo
