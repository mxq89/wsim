package cn.edu.ustc.wsim.service;

import java.util.Date;
import java.util.List;

import cn.edu.ustc.wsim.bean.Group;
import cn.edu.ustc.wsim.bean.GroupMessage;

public interface GroupMessageService extends BaseService {
	
	//获取某群组的聊天记录
	public List<GroupMessage> getGroupMessages(Group group);
	
	//查询群组聊天记录
	public List<GroupMessage> getGroupMessagesByTime(Group group, Date beginTime, Date endTime);

}
