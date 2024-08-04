package com.basic.lokaltask;


import java.util.List;

public class Job {
    private int id;
    private String title;
    private int type;
    private PrimaryDetails primary_details;
    private FeeDetails fee_details;
    private List<JobTag> job_tags;
    private int job_type;
    private int job_category_id;
    private int qualification;
    private int experience;
    private int shift_timing;
    private int job_role_id;
    private int salary_max;
    private int salary_min;
    private int city_location;
    private int locality;
    private String premium_till;
    private String content;
    private String company_name;
    private int advertiser;
    private String button_text;
    private String custom_link;
    private String amount;
    private int views;
    private int shares;
    private int fb_shares;
    private boolean is_bookmarked;
    private boolean is_applied;
    private boolean is_owner;
    private String updated_on;
    private String whatsapp_no;
    private ContactPreference contact_preference;
    private String created_on;
    private boolean is_premium;
    private List<Creative> creatives;
    private List<Video> videos;
    private List<Location> locations;
    private List<Tag> tags;
    private ContentV3 contentV3;
    private int status;
    private String expire_on;
    private String job_hours;
    private int openings_count;
    private String job_role;
    private String other_details;
    private String job_category;
    private int num_applications;
    private boolean enable_lead_collection;
    private boolean is_job_seeker_profile_mandatory;
    private TranslatedContent translated_content;
    private String job_location_slug;
    private String fees_text;
    private Integer question_bank_id;
    private Integer screening_retry;
    private boolean should_show_last_contacted;
    private int fees_charged;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public PrimaryDetails getPrimary_details() {
        return primary_details;
    }

    public void setPrimary_details(PrimaryDetails primary_details) {
        this.primary_details = primary_details;
    }

    public FeeDetails getFee_details() {
        return fee_details;
    }

    public void setFee_details(FeeDetails fee_details) {
        this.fee_details = fee_details;
    }

    public List<JobTag> getJob_tags() {
        return job_tags;
    }

    public void setJob_tags(List<JobTag> job_tags) {
        this.job_tags = job_tags;
    }

    public int getJob_type() {
        return job_type;
    }

    public void setJob_type(int job_type) {
        this.job_type = job_type;
    }

    public int getJob_category_id() {
        return job_category_id;
    }

    public void setJob_category_id(int job_category_id) {
        this.job_category_id = job_category_id;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getShift_timing() {
        return shift_timing;
    }

    public void setShift_timing(int shift_timing) {
        this.shift_timing = shift_timing;
    }

    public int getJob_role_id() {
        return job_role_id;
    }

    public void setJob_role_id(int job_role_id) {
        this.job_role_id = job_role_id;
    }

    public int getSalary_max() {
        return salary_max;
    }

    public void setSalary_max(int salary_max) {
        this.salary_max = salary_max;
    }

    public int getSalary_min() {
        return salary_min;
    }

    public void setSalary_min(int salary_min) {
        this.salary_min = salary_min;
    }

    public int getCity_location() {
        return city_location;
    }

    public void setCity_location(int city_location) {
        this.city_location = city_location;
    }

    public int getLocality() {
        return locality;
    }

    public void setLocality(int locality) {
        this.locality = locality;
    }

    public String getPremium_till() {
        return premium_till;
    }

    public void setPremium_till(String premium_till) {
        this.premium_till = premium_till;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(int advertiser) {
        this.advertiser = advertiser;
    }

    public String getButton_text() {
        return button_text;
    }

    public void setButton_text(String button_text) {
        this.button_text = button_text;
    }

    public String getCustom_link() {
        return custom_link;
    }

    public void setCustom_link(String custom_link) {
        this.custom_link = custom_link;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public int getFb_shares() {
        return fb_shares;
    }

    public void setFb_shares(int fb_shares) {
        this.fb_shares = fb_shares;
    }

    public boolean isIs_bookmarked() {
        return is_bookmarked;
    }

    public void setIs_bookmarked(boolean is_bookmarked) {
        this.is_bookmarked = is_bookmarked;
    }

    public boolean isIs_applied() {
        return is_applied;
    }

    public void setIs_applied(boolean is_applied) {
        this.is_applied = is_applied;
    }

    public boolean isIs_owner() {
        return is_owner;
    }

    public void setIs_owner(boolean is_owner) {
        this.is_owner = is_owner;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getWhatsapp_no() {
        return whatsapp_no;
    }

    public void setWhatsapp_no(String whatsapp_no) {
        this.whatsapp_no = whatsapp_no;
    }

    public ContactPreference getContact_preference() {
        return contact_preference;
    }

    public void setContact_preference(ContactPreference contact_preference) {
        this.contact_preference = contact_preference;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }

    public List<Creative> getCreatives() {
        return creatives;
    }

    public void setCreatives(List<Creative> creatives) {
        this.creatives = creatives;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ContentV3 getContentV3() {
        return contentV3;
    }

    public void setContentV3(ContentV3 contentV3) {
        this.contentV3 = contentV3;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getExpire_on() {
        return expire_on;
    }

    public void setExpire_on(String expire_on) {
        this.expire_on = expire_on;
    }

    public String getJob_hours() {
        return job_hours;
    }

    public void setJob_hours(String job_hours) {
        this.job_hours = job_hours;
    }

    public int getOpenings_count() {
        return openings_count;
    }

    public void setOpenings_count(int openings_count) {
        this.openings_count = openings_count;
    }

    public String getJob_role() {
        return job_role;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }

    public String getJob_category() {
        return job_category;
    }

    public void setJob_category(String job_category) {
        this.job_category = job_category;
    }

    public int getNum_applications() {
        return num_applications;
    }

    public void setNum_applications(int num_applications) {
        this.num_applications = num_applications;
    }

    public boolean isEnable_lead_collection() {
        return enable_lead_collection;
    }

    public void setEnable_lead_collection(boolean enable_lead_collection) {
        this.enable_lead_collection = enable_lead_collection;
    }

    public boolean isIs_job_seeker_profile_mandatory() {
        return is_job_seeker_profile_mandatory;
    }

    public void setIs_job_seeker_profile_mandatory(boolean is_job_seeker_profile_mandatory) {
        this.is_job_seeker_profile_mandatory = is_job_seeker_profile_mandatory;
    }

    public TranslatedContent getTranslated_content() {
        return translated_content;
    }

    public void setTranslated_content(TranslatedContent translated_content) {
        this.translated_content = translated_content;
    }

    public String getJob_location_slug() {
        return job_location_slug;
    }

    public void setJob_location_slug(String job_location_slug) {
        this.job_location_slug = job_location_slug;
    }

    public String getFees_text() {
        return fees_text;
    }

    public void setFees_text(String fees_text) {
        this.fees_text = fees_text;
    }

    public Integer getQuestion_bank_id() {
        return question_bank_id;
    }

    public void setQuestion_bank_id(Integer question_bank_id) {
        this.question_bank_id = question_bank_id;
    }

    public Integer getScreening_retry() {
        return screening_retry;
    }

    public void setScreening_retry(Integer screening_retry) {
        this.screening_retry = screening_retry;
    }

    public boolean isShould_show_last_contacted() {
        return should_show_last_contacted;
    }

    public void setShould_show_last_contacted(boolean should_show_last_contacted) {
        this.should_show_last_contacted = should_show_last_contacted;
    }

    public int getFees_charged() {
        return fees_charged;
    }

    public void setFees_charged(int fees_charged) {
        this.fees_charged = fees_charged;
    }
}







