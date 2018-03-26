package cn.edu.nju.soa.wsdl.impl;

import cn.edu.nju.soa.model.CourseScore;
import cn.edu.nju.soa.model.CourseScoreList;
import cn.edu.nju.soa.model.ScoreAttributeType;
import cn.edu.nju.soa.model.ScoreType;
import cn.edu.nju.soa.wsdl.*;

import javax.xml.ws.Holder;
import java.util.List;

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

    private void conversion(CourseScoreList courseScoreList) {
        List<CourseScore> courseScores = courseScoreList.getCourseScore();
        courseScores.forEach(courseScore -> {
            List<ScoreType> scoreTypes = courseScore.getScore();
            String studentId
            // 课程编号
            String courseId = courseScore.getCourseId();
            // 成绩性质
            ScoreAttributeType scoreAttributeType = courseScore.getScoreType();
        });
    }
}
