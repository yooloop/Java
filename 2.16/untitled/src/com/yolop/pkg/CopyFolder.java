package com.yolop.pkg;

import java.io.*;

public class CopyFolder {
    public static void main(String[] args) throws IOException {
        //要将源文件转成File对象
        File file = new File("F:\\Java素材");
        //获取源文件夹的名称
        String Scrname = file.getName();
        //拼接出一个目的地的文件夹地址
        File destfile = new File("F:\\java\\2.16\\untitled\\src\\com\\yolop\\pkg", Scrname);
        //如果目的地址不存在同名文件夹，在目的地址创建文件夹
        if(!destfile.exists()){
            destfile.mkdir();
        }

        //得到源文件夹下的文件名称
        File[] files = file.listFiles();
        for (File Scrfile : files) {
            String name = Scrfile.getName();//拿到源文件夹下文件的名称
            File DestFile = new File(destfile, name);//地址拼接
            tool.copyfile(Scrfile,DestFile);
        }

    }
}

class tool{
    public static void copyfile(File Srcfile,File Destfile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Srcfile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(Destfile));

        int len;
        byte[] bytes = new byte[8192];
        while((len =bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
