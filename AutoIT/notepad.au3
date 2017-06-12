

Run("Notepad.exe")

WinWaitActive("Untitled - Notepad")

ControlSend("Untitled - Notepad","","Edit1","hello hai niharika")



WinClose("Untitled - Notepad")

WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")

ControlFocus("Save As","","Edit1")

ControlSend("Save As","","Edit1","E:\niharika.txt")

ControlClick("Save As","","Button1")