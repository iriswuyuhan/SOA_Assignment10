package cn.edu.nju.jw.wsdl.impl;

import cn.edu.nju.jw.schema.课程成绩列表类型;
import cn.edu.nju.jw.wsdl.*;

import javax.xml.ws.Holder;

public class StuScoreImpl implements StuScoreInterface {

    @Override
    public void modify(Holder<课程成绩列表类型> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }

    @Override
    public void add(Holder<课程成绩列表类型> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }

    @Override
    public 课程成绩列表类型 get(String parameters) throws IdNotFindFault {

        return null;
    }

    @Override
    public void delete(Holder<课程成绩列表类型> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }
}
