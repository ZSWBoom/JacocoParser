package com.aurea.coverage;

import com.aurea.coverage.parser.JacocoParsers;
import com.aurea.coverage.unit.ModuleCoverage;

import java.nio.file.Paths;

public class ParseTest {

    private static final String XmlPath = "\"D:\\\\jacocoTestReport\"";

    public static void main(String[] args) {
//        CoverageIndex index = IdeaParsers.fromHtml(Paths.get("D:\\html\\com.example.alienware.jacocotest"));
//        ModuleCoverage moduleCoverage = index.getModuleCoverage();
//        MethodCoverage methodCoverage = moduleCoverage.methodCoverages()
//                .findFirst(mc -> mc.getName().equals("amore"))
//                .orElse(MethodCoverage.EMPTY);

        CoverageIndex index = JacocoParsers.fromXml(Paths.get(XmlPath));
        ModuleCoverage moduleCoverage = index.getModuleCoverage();
//        ClassCoverage coverage = moduleCoverage.classCoverages()
//                .findFirst(cc -> cc.getName.equals("Foo"))
//                .orElse(IdeaClassCoverage.EMPTY);
    }

}
