
; Set input focus to the edit control of Upload window using the handle returned by WinWait

$windowHandle=WinGetHandle("Open")
WinActivate($windowHandle)

  Sleep(2000)

; Set the File name text on the Edit field

  ;ControlSetText("File Upload", "", "Edit1", "SomeFile.txt")
  ControlSetText("Open", "", "[CLASS:Edit; INSTANCE:1]", "D:\SeleniumJava_Programs\WebDriver_Sessions_new\src\DialogBoxAutoITTests_Handel\test.jpg")


  Sleep(2000)

; Click on the Open button

  ControlClick("Open", "","[CLASS:Button; INSTANCE:1]");