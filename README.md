# Java 自动控制鼠标键盘简单程序

项目使用 Java1.8 版本

项目结构：

- **_src/AutoControl.java_** 为主类，程序运行起点  
  其中有一个重要属性 **useKeyControl** ，可以将脚本控制方法改为键盘控制(true)或者自动运行(false)

- **_src/Script.java_** 文件编写脚本
  你可以创建多个脚本文件，例如 Script1.java,Script2.java,Script3.java，用于运行不同的脚本

- **_src/Utils.java_** 为工具类，封装了控制键盘鼠标的方法和常用键盘鼠标常量
