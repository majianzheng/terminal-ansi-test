# 终端Ansi标准支持测试
ANSI转义序列是一种带内信号（英语：In-band signaling）的转义序列标准，用于控制视频文本终端上的光标位置、颜色和其他选项。在文本中嵌入确定的字节序列，大部分以ESC转义字符和"["字符开始，终端会把这些字节序列解释为相应的指令，而不是普通的字符编码。

## 编译 & 使用
测试程序可以测试系统的终端对Ansi标准的支持程度，不同的操作系统、不同的终端程序，其显示的效果和支持的程度是不同的。
一般的macOS和Linux都是支持的，但不一定支持所有标准，Windows上的cmd终端目前是不支持的，不过在Windows上可以使用第三方的终端工具，第三方的终端工具一般都是支持的。
### 编译java代码
```shell
javac AnsiTest.java
```
### 执行
```shell
java AnsiTest
```
在macOS上的终端效果如下，不过图片看不出来闪烁效果，macOS上只支持慢闪烁，不支持快闪烁

![macOS-view](https://gitee.com/majz0908/terminal-ansi-test/raw/main/doc/macOS-view.png)