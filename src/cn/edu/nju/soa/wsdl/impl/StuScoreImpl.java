package cn.edu.nju.soa.wsdl.impl;

import cn.edu.nju.soa.model.CourseScore;
import cn.edu.nju.soa.model.CourseScoreList;
import cn.edu.nju.soa.model.ScoreAttributeType;
import cn.edu.nju.soa.model.ScoreType;
import cn.edu.nju.soa.wsdl.*;

import javax.xml.ws.Holder;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StuScoreImpl implements StuScoreInterface {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("151250052", "������.txt");
        map.put("151250036", "�볬.txt");
        map.put("151250098", "��ΰ.txt");
        map.put("151250162", "���.txt");
        map.put("151250127", "���.txt");
        map.put("151250191", "�����.txt");
        map.put("151250007", "������.txt");
        map.put("151250214", "��Ӧɽ.txt");
        map.put("151250183", "�����.txt");
        map.put("151250134", "��ԭ.txt");
        map.put("151250170", "��־ͥ.txt");
        map.put("151250013", "�½�.txt");
    }

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

        String id = courseScoreList.getCourseScore().get(0).getScore().get(0).getSchoolNum();
        String fileName = map.get(id);

        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                    new File(fileName))));
            writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < 8; i++) {
                String line = reader.readLine();
                writer.write(line);
            }

            List<CourseScore> courseScores = courseScoreList.getCourseScore();
            for (int i = 0; i < courseScores.size(); i++) {
                CourseScore courseScore = courseScores.get(i);
                List<ScoreType> scoreTypes = courseScore.getScore();
                // �γ̱��
                String courseId = courseScore.getCourseId();
                // �ɼ�����
                String scoreAttributeType = courseScore.getScoreType().value();
                for (int j = 0; j < scoreTypes.size(); j++) {
                    ScoreType scoreType = scoreTypes.get(j);
                    String studentId = scoreType.getSchoolNum();
                    String score = String.valueOf(scoreType.getScore());
                    String res = courseId + "-" + scoreAttributeType + "-" + score;
                    writer.write(res);
                }
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CourseScoreList courseScoreList = new CourseScoreList();
        List<CourseScore> courseScores = new ArrayList<>();
        CourseScore courseScore = new CourseScore();
        courseScore.setScoreType(null);
        courseScore.setCourseId("000001");

        List<ScoreType> scoreTypes = new ArrayList<>();
        ScoreType scoreType = new ScoreType();
        scoreType.setSchoolNum("12");
        scoreType.setScore(99);
        scoreTypes.add(scoreType);
        courseScore.setScore(scoreTypes);
        courseScores.add(courseScore);
        courseScoreList.setCourseScore(courseScores);
        StuScoreImpl s = new StuScoreImpl();
        s.conversion(courseScoreList);
    }
}
