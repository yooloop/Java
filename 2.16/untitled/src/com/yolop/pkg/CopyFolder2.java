package com.yolop.pkg;

import java.io.*;

public class CopyFolder2 {
    public static void main(String[] args) throws IOException {
        File Srcfile = new File("F:\\Java素材");
        String Scrname = Srcfile.getName();
        File Destfile = new File("F:\\java\\2.16\\untitled\\src\\com\\yolop\\pkg", Scrname);
        if (!Destfile.exists()) {
            Destfile.mkdir();
        }

        //获取源文件夹的文件,复制
        foldercopy(Srcfile, Destfile);
    }


    public static void foldercopy(File Srcfile, File Destfile) throws IOException {
        File[] files = Srcfile.listFiles();
        //遍历创建
        for (File ScrFile : files) {
            if (ScrFile.isDirectory()) {//判断是否是文件夹
                String Folder_name = ScrFile.getName();
                File Src_new_folder = new File(Srcfile, Folder_name);
                File Dest_new_folder = new File(Destfile, Folder_name);
                Dest_new_folder.mkdir();
                foldercopy(Src_new_folder, Dest_new_folder);
            } else {
                String fileName = ScrFile.getName();
                File newfile = new File(Destfile, fileName);
                copyfile.Copyfile(ScrFile, newfile);
            }
        }
    }

    }


    class copyfile {
        public static void Copyfile(File ScrFile, File DestFile) throws IOException {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(ScrFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DestFile));

            int len;
            byte[] bytes = new byte[8192];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bis.close();
            bos.close();
        }
    }
