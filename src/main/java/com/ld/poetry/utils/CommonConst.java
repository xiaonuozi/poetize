package com.ld.poetry.utils;

public class CommonConst {

    /**
     * 超级管理员的用户Id
     */
    public static final int ADMIN_USER_ID = 1;

    /**
     * 根据用户ID获取Token
     */
    public static final String USER_TOKEN = "user_token_";

    public static final String ADMIN_TOKEN = "admin_token_";

    /**
     * 根据用户ID获取Token
     */
    public static final String USER_TOKEN_INTERVAL = "user_token_interval_";

    public static final String ADMIN_TOKEN_INTERVAL = "admin_token_interval_";

    /**
     * Token
     */
    public static final String USER_ACCESS_TOKEN = "user_access_token_";

    public static final String ADMIN_ACCESS_TOKEN = "admin_access_token_";

    public static final String TOKEN_HEADER = "Authorization";

    /**
     * Token过期时间：10天
     */
    public static final long TOKEN_EXPIRE = 864000;

    /**
     * Token重设过期时间间隔：1小时
     */
    public static final long TOKEN_INTERVAL = 3600;

    /**
     * Boss信息
     */
    public static final String ADMIN = "admin";

    /**
     * BossFamily信息
     */
    public static final String ADMIN_FAMILY = "adminFamily";

    /**
     * FamilyList信息
     */
    public static final String FAMILY_LIST = "familyList";

    /**
     * 评论和IM邮件
     */
    public static final String COMMENT_IM_MAIL = "comment_im_mail_";

    /**
     * 评论和IM邮件发送次数
     */
    public static final int COMMENT_IM_MAIL_COUNT = 1;

    /**
     * 验证码
     */
    public static final String USER_CODE = "user_code_";

    /**
     * 忘记密码时获取验证码用于找回密码
     */
    public static final String FORGET_PASSWORD = "forget_password_";

    /**
     * 网站信息
     */
    public static final String WEB_INFO = "webInfo";

    /**
     * 分类信息
     */
    public static final String SORT_INFO = "sortInfo";

    /**
     * 密钥
     */
    public static final String CRYPOTJS_KEY = "aoligeimeimaobin";

    /**
     * 根据用户ID获取用户信息
     */
    public static final String USER_CACHE = "user_";

    /**
     * 根据文章ID获取评论数量
     */
    public static final String COMMENT_COUNT_CACHE = "comment_count_";

    /**
     * 根据用户ID获取该用户所有文章ID
     */
    public static final String USER_ARTICLE_LIST = "user_article_list_";

    /**
     * 默认缓存过期时间
     */
    public static final long EXPIRE = 1800;

    /**
     * 树洞一次最多查询条数
     */
    public static final int TREE_HOLE_COUNT = 200;

    /**
     * 顶层评论ID
     */
    public static final int FIRST_COMMENT = 0;

    /**
     * 文章摘要默认字数
     */
    public static final int SUMMARY = 80;

    /**
     * 留言的源
     */
    public static final int TREE_HOLE_COMMENT_SOURCE = 0;

    /**
     * 七牛云
     */
    public static final String ACCESS_KEY = "PG3aAQEFwhO6IyJlYvdlWgMze_jKx1smwemnlgD6";

    public static final String SECRET_KEY = "LrKpffdCt30zXuXGDeB3S6wRegfRQ218TGDBuHgf";

    public static final String BUCKET = "xiaonuozi";

    public static final String DOWNLOAD_URL = "rrwsc30wu.hd-bkt.clouddn.com";

    /**
     * 资源类型
     */
    public static final String PATH_TYPE_GRAFFITI = "graffiti";

    public static final String PATH_TYPE_ARTICLE_PICTURE = "articlePicture";

    public static final String PATH_TYPE_USER_AVATAR = "userAvatar";

    public static final String PATH_TYPE_ARTICLE_COVER = "articleCover";

    public static final String PATH_TYPE_WEB_BACKGROUND_IMAGE = "webBackgroundImage";

    public static final String PATH_TYPE_WEB_AVATAR = "webAvatar";

    public static final String PATH_TYPE_RANDOM_AVATAR = "randomAvatar";

    public static final String PATH_TYPE_RANDOM_COVER = "randomCover";

    public static final String PATH_TYPE_COMMENT_PICTURE = "commentPicture";

    public static final String PATH_TYPE_INTERNET_MEME = "internetMeme";

    public static final String PATH_TYPE_IM_GROUP_AVATAR = "im/groupAvatar";

    public static final String PATH_TYPE_IM_GROUP_MESSAGE = "im/groupMessage";

    public static final String PATH_TYPE_IM_FRIEND_MESSAGE = "im/friendMessage";

    public static final String PATH_TYPE_FUNNY_URL = "funnyUrl";

    public static final String PATH_TYPE_FUNNY_COVER = "funnyCover";

    public static final String PATH_TYPE_LOVE_COVER = "love/bgCover";

    public static final String PATH_TYPE_LOVE_MAN = "love/manCover";

    public static final String PATH_TYPE_LOVE_WOMAN = "love/womanCover";

    /**
     * 资源路径
     */
    public static final String RESOURCE_PATH_TYPE_FRIEND = "friendUrl";
    public static final String RESOURCE_PATH_TYPE_FUNNY = "funny";
    public static final String RESOURCE_PATH_TYPE_LOVE_PHOTO = "lovePhoto";

    /**
     * 微言
     */
    public static final String WEIYAN_TYPE_FRIEND = "friend";

    public static final String WEIYAN_TYPE_NEWS = "news";
}
