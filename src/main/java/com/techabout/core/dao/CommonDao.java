package com.techabout.core.dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CommonDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    // 단건 조회
    public <T> T selectOne(String sqlId) {
        return sqlSession.selectOne(sqlId);
    }

    public <T> T selectOne(String sqlId, Object object) {
        return sqlSession.selectOne(sqlId, object);
    }

    // 다건 조회
    public <E> List<E> selectList(String sqlId) {
        return sqlSession.selectList(sqlId);
    }

    public <E> List<E> selectList(String sqlId, Object object) {
        return sqlSession.selectList(sqlId, object);
    }

    // 건수 조회
    public int getTotalCount(String sqlId) {
        return sqlSession.selectList(sqlId).size();
    }

    public int getTotalCount(String sqlId, Object object) {
        return sqlSession.selectList(sqlId, object).size();
    }

    // 등록
    public int insert(String sqlId) {
        return sqlSession.insert(sqlId);
    }

    public int insert(String sqlId, Object object) {
        return sqlSession.insert(sqlId, object);
    }

    // 수정
    public int update(String sqlId) {
        return sqlSession.update(sqlId);
    }

    public int update(String sqlId, Object object) {
        return sqlSession.update(sqlId, object);
    }

    // 삭제
    public int delete(String sqlId) {
        return sqlSession.delete(sqlId);
    }

    public int delete(String sqlId, Object object) {
        return sqlSession.delete(sqlId, object);
    }
}