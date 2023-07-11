package com.jerry.structural.composite;

/**
 * 组合模式<br/>
 *
 * @author qijie
 * @date 2023/7/12
 */
public class CompositePatternTest {

    public static void main(String[] args) {

        File video = new File("黑猫警长", 10000);
        Directory videoDir = new Directory("视频文件夹");
        Directory dDir = new Directory("D盘");
        File excel = new File("excel文件", 1000);

        dDir.addEntry(videoDir);
        dDir.addEntry(excel);
        videoDir.addEntry(video);

        System.out.println(dDir.getSize());
    }

}
