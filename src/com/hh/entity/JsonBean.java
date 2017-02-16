package com.hh.entity;

import java.util.List;

public class JsonBean extends Json{
	private int friendid;
	private User user;
	private String subgroundname;
	private String grouptablename;
	private int gtid;
	private int groupid;
	private int markid;
	private int sgid;
	private String phone ;
	private String msg ;
	private String friendphone ;//好友手机号
	private String oldpassword ;//旧密码
	private String newpassword ;//新密码
	private String newemail ;
	private String addressname ;
	private  double lat ;
	private double lng ;
	private int senduserid ;//发送方id
	private int receiverid ;//接收方id
	private int actid ;//活动id
	private int range ;//检索距离
	/*private Location location;
	private Mark mark;
	private MarkTop markTop;
	private MarkComment markComment;
	private Act act;
	private MarkDetial markDetial;
	private List<Friend> friends;
	private List<User> users;
	private List<GroupTable> groupTables;
	private GroupTable groupTable;
	private List<Subgroup> subgroups;
	private List<UserGroup> userGroups;
	private List<Location> locations;
	private List<MarkComment> markComments;
	private List<MarkDetial> markDetials;
	private List<Mark> marks;
	private List<String> phones;
	private List<Chat> chats;
	private List<GroupChat> groupChats;
	private List<Act> acts;
	private List<ActInfo> actInfos;
	private List<Integer> sgts;
	private List<Integer> userids;
	private List<UserLocation> userLocations;
	private UserLocation userLocation;*/
	





	/*public List<Integer> getUserids() {
		return userids;
	}

	public void setUserids(List<Integer> userids) {
		this.userids = userids;
	}

	public List<UserLocation> getUserLocations() {
		return userLocations;
	}

	public void setUserLocations(List<UserLocation> userLocations) {
		this.userLocations = userLocations;
	}

	public UserLocation getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(UserLocation userLocation) {
		this.userLocation = userLocation;
	}

	public List<MarkComment> getMarkComments() {
		return markComments;
	}

	public void setMarkComments(List<MarkComment> markComments) {
		this.markComments = markComments;
	}

	public MarkComment getMarkComment() {
		return markComment;
	}

	public void setMarkComment(MarkComment markComment) {
		this.markComment = markComment;
	}

	public MarkTop getMarkTop() {
		return markTop;
	}

	public void setMarkTop(MarkTop markTop) {
		this.markTop = markTop;
	}

	public List<MarkDetial> getMarkDetials() {
		return markDetials;
	}

	public void setMarkDetials(List<MarkDetial> markDetials) {
		this.markDetials = markDetials;
	}*/

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getAddressname() {
		return addressname;
	}

	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	/*public GroupTable getGroupTable() {
		return groupTable;
	}

	public void setGroupTable(GroupTable groupTable) {
		this.groupTable = groupTable;
	}

	public List<Integer> getSgts() {
		return sgts;
	}

	public void setSgts(List<Integer> sgts) {
		this.sgts = sgts;
	}*/

	public String getNewemail() {
		return newemail;
	}

	public void setNewemail(String newemail) {
		this.newemail = newemail;
	}

	/*public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public List<ActInfo> getActInfos() {
		return actInfos;
	}

	public void setActInfos(List<ActInfo> actInfos) {
		this.actInfos = actInfos;
	}

	public List<Act> getActs() {
		return acts;
	}

	public void setActs(List<Act> acts) {
		this.acts = acts;
	}
*/
	public int getActid() {
		return actid;
	}

	public void setActid(int actid) {
		this.actid = actid;
	}

	/*public Act getAct() {
		return act;
	}

	public void setAct(Act act) {
		this.act = act;
	}

	public List<Chat> getChats() {
		return chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}

	public List<GroupChat> getGroupChats() {
		return groupChats;
	}

	public void setGroupChats(List<GroupChat> groupChats) {
		this.groupChats = groupChats;
	}
*/
	public int getSenduserid() {
		return senduserid;
	}

	public void setSenduserid(int senduserid) {
		this.senduserid = senduserid;
	}

	public int getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(int receiverid) {
		this.receiverid = receiverid;
	}

/*	public MarkDetial getMarkDetial() {
		return markDetial;
	}

	public void setMarkDetial(MarkDetial markDetial) {
		this.markDetial = markDetial;
	}*/

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	/*public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}*/

	public int getMarkid() {
		return markid;
	}

	public void setMarkid(int markid) {
		this.markid = markid;
	}
/*
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}*/

	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/*public List<UserGroup> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(List<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}*/

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public int getSgid() {
		return sgid;
	}

	public void setSgid(int sgid) {
		this.sgid = sgid;
	}

	public String getFriendphone() {
		return friendphone;
	}

	public void setFriendphone(String friendphone) {
		this.friendphone = friendphone;
	}

	public int getGtid() {
		return gtid;
	}

	public void setGtid(int gtid) {
		this.gtid = gtid;
	}

	public int getFriendid() {
		return friendid;
	}

	public void setFriendid(int friendid) {
		this.friendid = friendid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSubgroundname() {
		return subgroundname;
	}

	public void setSubgroundname(String subgroundname) {
		this.subgroundname = subgroundname;
	}

	public String getGrouptablename() {
		return grouptablename;
	}

	public void setGrouptablename(String grouptablename) {
		this.grouptablename = grouptablename;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Friend> getFriends() {
		return friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<GroupTable> getGroupTables() {
		return groupTables;
	}

	public void setGroupTables(List<GroupTable> groupTables) {
		this.groupTables = groupTables;
	}

	public List<Subgroup> getSubgroups() {
		return subgroups;
	}

	public void setSubgroups(List<Subgroup> subgroups) {
		this.subgroups = subgroups;
	}
*/
	/**
	 * 5获取所有用户
	 * @param type 类型
	 * @param userid 用户ID
	 * @param key key
	 * @param message 消息
	 */
	public JsonBean(int type, int userid, String key, String message) {
		super(type, userid, key, message);
	}

	public JsonBean() {
		super();
	}
	


}
