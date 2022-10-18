package com.spring.codeblog.service.serviceImplements;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeblogServiceImplements implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRespository;
    
    @Override
    public List<Post> findAll() {
        return codeblogRespository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRespository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRespository.save(post);
    }
    
    
    
}
