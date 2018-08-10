package com.wstar.service.user;

public interface IUserMgtService {

	/**
	 * 验证用户是否存在
	 * @author max
	 * @date:   2018年8月10日
	 * @Desc :
	 * @param mobilephone
	 * @return
	 */
	public boolean isExistUser(String mobilephone);
}
