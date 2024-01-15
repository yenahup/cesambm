package com.cesam.cesam.web.data.organisation.informations.post.response;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.administration.Bureau;
import com.cesam.cesam.entity.organisation.informations.Documents;

public class PostResponse {

    private Long postId;

    private String title;

    private Date datePost;

    private Bureau bureau;

    private Documents documents;
}
