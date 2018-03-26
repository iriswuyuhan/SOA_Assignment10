package cn.edu.nju.soa.wsdl.impl;

import cn.edu.nju.soa.model.CourseScoreList;
import cn.edu.nju.soa.wsdl.*;

import javax.xml.ws.Holder;

public class StuScoreImpl implements StuScoreInterface {


    @Override
    public void modify(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }

    @Override
    public void add(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }

    @Override
    public CourseScoreList get(String parameters) throws IdNotFindFault {
        return null;
    }

    @Override
    public void delete(Holder<CourseScoreList> parameters) throws CourseIdFault, StudentIdFault, ScoreUpdateFault, ScoreTypeFault {

    }
}
