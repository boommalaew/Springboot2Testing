package com.vega.springit.service;

import com.vega.springit.Repository.VoteRepository;
import com.vega.springit.domain.Vote;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }

}
