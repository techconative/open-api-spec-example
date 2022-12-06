package com.techconative.openapispec.blog.restcontroller;

import com.techconative.openapispec.blog.api.GithubApi;
import com.techconative.openapispec.blog.model.RepositoryVO;
import com.techconative.openapispec.blog.model.UserVO;
import org.springframework.http.ResponseEntity;

import java.util.List;


public class UserRestController implements GithubApi{

    @Override public ResponseEntity<List<RepositoryVO>> getReposForUser(String userid) {

        return null;
    }


    @Override public ResponseEntity<UserVO> getUserDetails(String userId) {

        return null;
    }


    @Override public ResponseEntity<Object> getUserRepoStats(String userId) {

        return null;
    }
}
