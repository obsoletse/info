package com.linbin.jmu;

import org.mybatis.generator.api.ShellRunner;

public class MybatisGenerator {
    public static void main(String[] args) throws Exception{
        args = new String[] {"-configfile", "G:\\idea\\info\\src\\main\\resources\\db\\mybatis-generator.xml", "-overwrite"};
        ShellRunner.main(args);
    }
}
