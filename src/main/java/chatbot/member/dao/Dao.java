package chatbot.member.dao;

import chatbot.member.dto.MemberDTO;

public interface Dao {

    void save(MemberDTO member);

    MemberDTO findMemberbyId(String id);

    boolean findId(String id);

}
