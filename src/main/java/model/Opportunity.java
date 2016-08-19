package model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Opportunity {
	// Strongly Determined
	private int referral_source;
	private Boolean is_agricultural;
	private Double secondary_financing_amount;
	private String charge_on_title;
	private Boolean is_rental_property;
	private Double total_comp_amount;
	private String date_created_co_applicant;
	private String application_no;
	private Boolean is_rooming_houses;
	private String lot_size;
	private Double condo_fees;
	private String lot;
	private String referred;
	private Double base_comp_amount;
	private String applicant_last_name;
	private Boolean is_duplex;
	private Double total_mortgage_amount;
	private Double existing_equity_amount;
	private Double current_mortgage_amount;
	private String future_family;
	private String write_date;
	private String condition_of_financing_date;
	private Integer final_lender;
	private String desired_mortgage_type;
	private Boolean is_high_ratio_2nd_home;
	private Double marketing_comp_amount;
	private Integer draws_required;
	private Boolean is_condo;
	private String lender_response;
	private Boolean is_boarding_houses;
	private Boolean is_grow_ops;
	private Double outbuildings_value;
	private Boolean non_income_qualifer;
	private Boolean is_modular_homes;

	private Double renovation_value;
	private Boolean is_co_operative_housing;
	private Double current_balance;
	private Double monthly_rental_income;
	private String mortgage_type;
	private Double GDS;
	private Boolean isUpdatedToUA;
	private Double broker_fee;
	private String insurerref;
	private String current_lender;
	private String spouse;
	private Boolean is_agricultural_less_10_acres;
	private String email_from;
	private String expected_closing_date;
	private Boolean is_life_leased_property;
	private Integer partner_id;
	private String date_action_last;
	private String buy_new_vehicle;
	private Boolean is_mobile_homes;
	private Boolean is_age_restricted;
	private Double monthly_payment;
	private String existing_lender;
	private String future_mortgage;
	private String marketing_auto;
	private Boolean verify_product;
	private Double personal_cash_amount;
	private String new_home_warranty;
	private Boolean is_country_residential;
	private Double ltv;
	private Boolean lender_requires_insurance;
	private String internal_note_property;
	private Boolean concerns_addressed_check;
	private String priority;
	private String description;
	private String province;
	private Double planned_revenue;
	private String op_info_type;
	private String fax;
	private String date_action;
	private String email_cc;
	private String income_decreased_worried;
	private Boolean mortgage_insured;
	private String existing_mortgage;
	private Double min_heat_fee;
	private Integer lead_source;
	private Boolean qualified_check;
	private String postal_code;
	private Boolean active;
	private Double property_taxes;
	private Boolean is_floating_homes;
	private String mobile;
	private Integer opp_info_rate;
	private Double charges_behind_amount;
	private String application_date;
	private Integer realtor;
	private String garage_type;
	private String name;
	private Double desired_mortgage_amount;
	private String product_type;
	private Boolean is_leased_land;
	private String job_5_years;
	private String property_type;
	private String source_of_borrowing;
	private Integer square_footage;
	private Integer color;
	private String email_work;
	private Boolean is_a_small_centre;
	private Double sale_of_existing_amount;
	private String heating;
	private String desired_product_type;
	private Boolean is_non_conv_construction;
	private String partner_name;
	private String term_rate;
	private Boolean process_presntedutio_check;
	private String property_style;
	private String garage_size;
	private String street;
	private String title_action;
	private String opp_info_start_date;
	private String city;
	private String create_date;
	private Boolean has_charges_behind;
	private String renewaldate;
	private String lender_name;
	private Double day_close;
	private String date_closed;
	private String down_payment_coming_from;
	private String date_deadline;
	private Boolean approached_check;
	private Double day_open;
	private String insurer;
	private Double current_monthly_payment;
	private String sewage;
	private Boolean is_four_plex;
	private String lifestyle_change;
	private Double lender_fee;
	private Boolean pending_application_check;
	private Boolean is_raw_land;
	private Boolean is_cottage_rec_property;
	private String Township_PID;
	private Double rrsp_amount;
	private String opp_info_type;
	private Double purchase_price;
	private Boolean is_military;
	private String work_phone;
	private String financial_risk_taker;
	private Integer lender;
	private Double trailer_comp_amount;
	private String opp_info_renewal_date;
	private String block;
	private Double TDS;
	private String lender_ref;
	private Double sweat_equity_amount;
	private String internal_notes_final;
	private Integer selected_product;
	private Double other_amount;
	private String what_is_your_lending_goal;
	private Double probability;
	private Double bank_account;
	private Boolean opt_out;
	private Double acres;
	private String estimated_valueof_home;
	private String water;
	private String trigger;
	private Double current_interest_rate;
	private String current_mortgage_type;
	private Integer cash_back;
	private Double planned_cost;
	private Double gifted_amount;
	private Boolean is_rental_pools;
	private String living_in_property;
	private Double down_payment_amount;
	private Boolean is_fractional_interests;
	private String property_less_then_5_years;
	private Integer opp_info_loan_amnt;
	private String phone;
	private String web_response;
	private String apartment_style;
	private String mls;
	private String current_renewal_date;
	private String type;
	private Boolean is_commercial;
	private Double distance_to_major_center;
	private String function;
	private Integer age;
	private String date_open;
	private String contact_name;
	private String internal_note;
	private Double volume_bonus_amount;
	private Boolean is_construction_mortgage;
	// private Double amortization;
	private String amortization;
	private String open_closed;
	private String ref2;
	private String date_action_next;
	private Boolean maximum_amount;
	private Double total_one_time_fees;
	private String renter_pay_heating;
	private String state;
	private int id;
	private Double downpayment_amount;
	private Double rate;
	private Double base_commission;
	private Double insurerfee;
	private String building_funds;
	private String street2;
	private String zip;
	private String preferred_number;
	private Double commitment_fee;
	private String credit_story;
	private String referred_source;
	private String closing_date;
	private String morweb_filogix;
	private Boolean is_eight_plex;
	private String internal_notes;
	private Double property_value;
	private String plan;
	private Integer desired_amortization;
	private String term;
	private String address;
	private Boolean is_six_plex;
	private Double borrowed_amount;

	// Doubt
	private String state_id;
	private String document_fields;
	private String assistant;
	private String congrats_date;
	private int opportunity_id;
	private String to_pages;
	private String x_bypass_proposal;
	private String dup_task_created;
	private String looking_to;
	private String client_email_rem;
	private String final_documents;
	private String prod_count;
	private String deadline;
	private String create_uid;
	private String training_associate_referral;
	private String greeting_send;
	private String fax1;
	private String renewal_reminder;
	private String ref;
	private String payment_mode;
	private String lead_followup_date;
	private String desired_term;
	private String renewal_email_send;
	private String delayed_app_date;
	private String x_selected_recommendation;
	private Double referral_fee;
	private String company_id;
	private String frequency;
	private String trainee;
	private String user_id;
	private String propsal_date;
	private Double private_fee;
	private String new_opp_users;
	private String volume_commission;
	private String post_selection;
	private String lead_followed;
	private String all_email_ids;
	private String webform_uname;
	private String template_date;
	private Boolean is_uninsured_conv_2nd_home;
	private String renewal_mail_date;
	private String channel_id;
	private String stage_id;
	private String title;
	private String needs_power_attorney;
	private String country_id;
	private String current_mortgage_product;
	private String x_base_ltv;
	private String type_id;
	private String sales_associate;
	private String looking_fora;
	private String webform_pwd;
	private String delayed_app_task;
	private String underwriter;
	private String x_company;
	private String hr_department_id;
	private String existing_payout_penalty;
	private String write_uid;
	private String section_id;
	private String current_lender_moved0;
	private String date_renewed;
	private String lawyer;
	private String completed_ref;
	private String all_product_clicked;
	private Boolean task_created;
	private String from_web_form;
	private String from_pages;
	private String plus_minus_prime;
	private String considered_cites;
	private String welcum_email_date;
	private String client_remd;
	private String desired_amortization_moved1;
	private String desired_amortization_moved0;
	private String client_survey;

	public Opportunity() {
		// TODO Auto-generated constructor stub
	}

	public int getReferral_source() {
		return referral_source;
	}

	public void setReferral_source(int referral_source) {
		this.referral_source = referral_source;
	}

	public Boolean getIs_agricultural() {
		return is_agricultural;
	}

	public void setIs_agricultural(Boolean is_agricultural) {
		this.is_agricultural = is_agricultural;
	}

	public Double getSecondary_financing_amount() {
		return secondary_financing_amount;
	}

	public void setSecondary_financing_amount(Double secondary_financing_amount) {
		this.secondary_financing_amount = secondary_financing_amount;
	}

	public String getCharge_on_title() {
		return charge_on_title;
	}

	public void setCharge_on_title(String charge_on_title) {
		this.charge_on_title = charge_on_title;
	}

	public Boolean getIs_rental_property() {
		return is_rental_property;
	}

	public void setIs_rental_property(Boolean is_rental_property) {
		this.is_rental_property = is_rental_property;
	}

	public Double getTotal_comp_amount() {
		return total_comp_amount;
	}

	public void setTotal_comp_amount(Double total_comp_amount) {
		this.total_comp_amount = total_comp_amount;
	}

	public String getDate_created_co_applicant() {
		return date_created_co_applicant;
	}

	public void setDate_created_co_applicant(String date_created_co_applicant) {
		this.date_created_co_applicant = date_created_co_applicant;
	}

	public String getApplication_no() {
		return application_no;
	}

	public void setApplication_no(String application_no) {
		this.application_no = application_no;
	}

	public Boolean getIs_rooming_houses() {
		return is_rooming_houses;
	}

	public void setIs_rooming_houses(Boolean is_rooming_houses) {
		this.is_rooming_houses = is_rooming_houses;
	}

	public String getLot_size() {
		return lot_size;
	}

	public void setLot_size(String lot_size) {
		this.lot_size = lot_size;
	}

	public Double getCondo_fees() {
		return condo_fees;
	}

	public void setCondo_fees(Double condo_fees) {
		this.condo_fees = condo_fees;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getReferred() {
		return referred;
	}

	public void setReferred(String referred) {
		this.referred = referred;
	}

	public Double getBase_comp_amount() {
		return base_comp_amount;
	}

	public void setBase_comp_amount(Double base_comp_amount) {
		this.base_comp_amount = base_comp_amount;
	}

	public String getApplicant_last_name() {
		return applicant_last_name;
	}

	public void setApplicant_last_name(String applicant_last_name) {
		this.applicant_last_name = applicant_last_name;
	}

	public Boolean getIs_duplex() {
		return is_duplex;
	}

	public void setIs_duplex(Boolean is_duplex) {
		this.is_duplex = is_duplex;
	}

	public Double getTotal_mortgage_amount() {
		return total_mortgage_amount;
	}

	public void setTotal_mortgage_amount(Double total_mortgage_amount) {
		this.total_mortgage_amount = total_mortgage_amount;
	}

	public Double getExisting_equity_amount() {
		return existing_equity_amount;
	}

	public void setExisting_equity_amount(Double existing_equity_amount) {
		this.existing_equity_amount = existing_equity_amount;
	}

	public Double getCurrent_mortgage_amount() {
		return current_mortgage_amount;
	}

	public void setCurrent_mortgage_amount(Double current_mortgage_amount) {
		this.current_mortgage_amount = current_mortgage_amount;
	}

	public String getFuture_family() {
		return future_family;
	}

	public void setFuture_family(String future_family) {
		this.future_family = future_family;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getCondition_of_financing_date() {
		return condition_of_financing_date;
	}

	public void setCondition_of_financing_date(
			String condition_of_financing_date) {
		this.condition_of_financing_date = condition_of_financing_date;
	}

	public Integer getFinal_lender() {
		return final_lender;
	}

	public void setFinal_lender(Integer final_lender) {
		this.final_lender = final_lender;
	}

	public String getDesired_mortgage_type() {
		return desired_mortgage_type;
	}

	public void setDesired_mortgage_type(String desired_mortgage_type) {
		this.desired_mortgage_type = desired_mortgage_type;
	}

	public Boolean getIs_high_ratio_2nd_home() {
		return is_high_ratio_2nd_home;
	}

	public void setIs_high_ratio_2nd_home(Boolean is_high_ratio_2nd_home) {
		this.is_high_ratio_2nd_home = is_high_ratio_2nd_home;
	}

	public Double getMarketing_comp_amount() {
		return marketing_comp_amount;
	}

	public void setMarketing_comp_amount(Double marketing_comp_amount) {
		this.marketing_comp_amount = marketing_comp_amount;
	}

	public Integer getDraws_required() {
		return draws_required;
	}

	public void setDraws_required(Integer draws_required) {
		this.draws_required = draws_required;
	}

	public Boolean getIs_condo() {
		return is_condo;
	}

	public void setIs_condo(Boolean is_condo) {
		this.is_condo = is_condo;
	}

	public String getLender_response() {
		return lender_response;
	}

	public void setLender_response(String lender_response) {
		this.lender_response = lender_response;
	}

	public Boolean getIs_boarding_houses() {
		return is_boarding_houses;
	}

	public void setIs_boarding_houses(Boolean is_boarding_houses) {
		this.is_boarding_houses = is_boarding_houses;
	}

	public Boolean getIs_grow_ops() {
		return is_grow_ops;
	}

	public void setIs_grow_ops(Boolean is_grow_ops) {
		this.is_grow_ops = is_grow_ops;
	}

	public Double getOutbuildings_value() {
		return outbuildings_value;
	}

	public void setOutbuildings_value(Double outbuildings_value) {
		this.outbuildings_value = outbuildings_value;
	}

	public Boolean getNon_income_qualifer() {
		return non_income_qualifer;
	}

	public void setNon_income_qualifer(Boolean non_income_qualifer) {
		this.non_income_qualifer = non_income_qualifer;
	}

	public Boolean getIs_modular_homes() {
		return is_modular_homes;
	}

	public void setIs_modular_homes(Boolean is_modular_homes) {
		this.is_modular_homes = is_modular_homes;
	}

	public Double getRenovation_value() {
		return renovation_value;
	}

	public void setRenovation_value(Double renovation_value) {
		this.renovation_value = renovation_value;
	}

	public Boolean getIs_co_operative_housing() {
		return is_co_operative_housing;
	}

	public void setIs_co_operative_housing(Boolean is_co_operative_housing) {
		this.is_co_operative_housing = is_co_operative_housing;
	}

	public Double getCurrent_balance() {
		return current_balance;
	}

	public void setCurrent_balance(Double current_balance) {
		this.current_balance = current_balance;
	}

	public Double getMonthly_rental_income() {
		return monthly_rental_income;
	}

	public void setMonthly_rental_income(Double monthly_rental_income) {
		this.monthly_rental_income = monthly_rental_income;
	}

	public String getMortgage_type() {
		return mortgage_type;
	}

	public void setMortgage_type(String mortgage_type) {
		this.mortgage_type = mortgage_type;
	}

	public Double getGDS() {
		return GDS;
	}

	public void setGDS(Double gDS) {
		GDS = gDS;
	}

	public Boolean getIsUpdatedToUA() {
		return isUpdatedToUA;
	}

	public void setIsUpdatedToUA(Boolean isUpdatedToUA) {
		this.isUpdatedToUA = isUpdatedToUA;
	}

	public Double getBroker_fee() {
		return broker_fee;
	}

	public void setBroker_fee(Double broker_fee) {
		this.broker_fee = broker_fee;
	}

	public String getInsurerref() {
		return insurerref;
	}

	public void setInsurerref(String insurerref) {
		this.insurerref = insurerref;
	}

	public String getCurrent_lender() {
		return current_lender;
	}

	public void setCurrent_lender(String current_lender) {
		this.current_lender = current_lender;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public Boolean getIs_agricultural_less_10_acres() {
		return is_agricultural_less_10_acres;
	}

	public void setIs_agricultural_less_10_acres(
			Boolean is_agricultural_less_10_acres) {
		this.is_agricultural_less_10_acres = is_agricultural_less_10_acres;
	}

	public String getEmail_from() {
		return email_from;
	}

	public void setEmail_from(String email_from) {
		this.email_from = email_from;
	}

	public String getExpected_closing_date() {
		return expected_closing_date;
	}

	public void setExpected_closing_date(String expected_closing_date) {
		this.expected_closing_date = expected_closing_date;
	}

	public Boolean getIs_life_leased_property() {
		return is_life_leased_property;
	}

	public void setIs_life_leased_property(Boolean is_life_leased_property) {
		this.is_life_leased_property = is_life_leased_property;
	}

	public Integer getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(Integer partner_id) {
		this.partner_id = partner_id;
	}

	public String getDate_action_last() {
		return date_action_last;
	}

	public void setDate_action_last(String date_action_last) {
		this.date_action_last = date_action_last;
	}

	public String getBuy_new_vehicle() {
		return buy_new_vehicle;
	}

	public void setBuy_new_vehicle(String buy_new_vehicle) {
		this.buy_new_vehicle = buy_new_vehicle;
	}

	public Boolean getIs_mobile_homes() {
		return is_mobile_homes;
	}

	public void setIs_mobile_homes(Boolean is_mobile_homes) {
		this.is_mobile_homes = is_mobile_homes;
	}

	public Boolean getIs_age_restricted() {
		return is_age_restricted;
	}

	public void setIs_age_restricted(Boolean is_age_restricted) {
		this.is_age_restricted = is_age_restricted;
	}

	public Double getMonthly_payment() {
		return monthly_payment;
	}

	public void setMonthly_payment(Double monthly_payment) {
		this.monthly_payment = monthly_payment;
	}

	public String getExisting_lender() {
		return existing_lender;
	}

	public void setExisting_lender(String existing_lender) {
		this.existing_lender = existing_lender;
	}

	public String getFuture_mortgage() {
		return future_mortgage;
	}

	public void setFuture_mortgage(String future_mortgage) {
		this.future_mortgage = future_mortgage;
	}

	public String getMarketing_auto() {
		return marketing_auto;
	}

	public void setMarketing_auto(String marketing_auto) {
		this.marketing_auto = marketing_auto;
	}

	public Boolean getVerify_product() {
		return verify_product;
	}

	public void setVerify_product(Boolean verify_product) {
		this.verify_product = verify_product;
	}

	public Double getPersonal_cash_amount() {
		return personal_cash_amount;
	}

	public void setPersonal_cash_amount(Double personal_cash_amount) {
		this.personal_cash_amount = personal_cash_amount;
	}

	public String getNew_home_warranty() {
		return new_home_warranty;
	}

	public void setNew_home_warranty(String new_home_warranty) {
		this.new_home_warranty = new_home_warranty;
	}

	public Boolean getIs_country_residential() {
		return is_country_residential;
	}

	public void setIs_country_residential(Boolean is_country_residential) {
		this.is_country_residential = is_country_residential;
	}

	public Double getLtv() {
		return ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	public Boolean getLender_requires_insurance() {
		return lender_requires_insurance;
	}

	public void setLender_requires_insurance(Boolean lender_requires_insurance) {
		this.lender_requires_insurance = lender_requires_insurance;
	}

	public String getInternal_note_property() {
		return internal_note_property;
	}

	public void setInternal_note_property(String internal_note_property) {
		this.internal_note_property = internal_note_property;
	}

	public Boolean getConcerns_addressed_check() {
		return concerns_addressed_check;
	}

	public void setConcerns_addressed_check(Boolean concerns_addressed_check) {
		this.concerns_addressed_check = concerns_addressed_check;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Double getPlanned_revenue() {
		return planned_revenue;
	}

	public void setPlanned_revenue(Double planned_revenue) {
		this.planned_revenue = planned_revenue;
	}

	public String getOp_info_type() {
		return op_info_type;
	}

	public void setOp_info_type(String op_info_type) {
		this.op_info_type = op_info_type;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDate_action() {
		return date_action;
	}

	public void setDate_action(String date_action) {
		this.date_action = date_action;
	}

	public String getEmail_cc() {
		return email_cc;
	}

	public void setEmail_cc(String email_cc) {
		this.email_cc = email_cc;
	}

	public String getIncome_decreased_worried() {
		return income_decreased_worried;
	}

	public void setIncome_decreased_worried(String income_decreased_worried) {
		this.income_decreased_worried = income_decreased_worried;
	}

	public Boolean getMortgage_insured() {
		return mortgage_insured;
	}

	public void setMortgage_insured(Boolean mortgage_insured) {
		this.mortgage_insured = mortgage_insured;
	}

	public String getExisting_mortgage() {
		return existing_mortgage;
	}

	public void setExisting_mortgage(String existing_mortgage) {
		this.existing_mortgage = existing_mortgage;
	}

	public Double getMin_heat_fee() {
		return min_heat_fee;
	}

	public void setMin_heat_fee(Double min_heat_fee) {
		this.min_heat_fee = min_heat_fee;
	}

	public Integer getLead_source() {
		return lead_source;
	}

	public void setLead_source(Integer lead_source) {
		this.lead_source = lead_source;
	}

	public Boolean getQualified_check() {
		return qualified_check;
	}

	public void setQualified_check(Boolean qualified_check) {
		this.qualified_check = qualified_check;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Double getProperty_taxes() {
		return property_taxes;
	}

	public void setProperty_taxes(Double property_taxes) {
		this.property_taxes = property_taxes;
	}

	public Boolean getIs_floating_homes() {
		return is_floating_homes;
	}

	public void setIs_floating_homes(Boolean is_floating_homes) {
		this.is_floating_homes = is_floating_homes;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getOpp_info_rate() {
		return opp_info_rate;
	}

	public void setOpp_info_rate(Integer opp_info_rate) {
		this.opp_info_rate = opp_info_rate;
	}

	public Double getCharges_behind_amount() {
		return charges_behind_amount;
	}

	public void setCharges_behind_amount(Double charges_behind_amount) {
		this.charges_behind_amount = charges_behind_amount;
	}

	public String getApplication_date() {
		return application_date;
	}

	public void setApplication_date(String application_date) {
		this.application_date = application_date;
	}

	public Integer getRealtor() {
		return realtor;
	}

	public void setRealtor(Integer realtor) {
		this.realtor = realtor;
	}

	public String getGarage_type() {
		return garage_type;
	}

	public void setGarage_type(String garage_type) {
		this.garage_type = garage_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDesired_mortgage_amount() {
		return desired_mortgage_amount;
	}

	public void setDesired_mortgage_amount(Double desired_mortgage_amount) {
		this.desired_mortgage_amount = desired_mortgage_amount;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public Boolean getIs_leased_land() {
		return is_leased_land;
	}

	public void setIs_leased_land(Boolean is_leased_land) {
		this.is_leased_land = is_leased_land;
	}

	public String getJob_5_years() {
		return job_5_years;
	}

	public void setJob_5_years(String job_5_years) {
		this.job_5_years = job_5_years;
	}

	public String getProperty_type() {
		return property_type;
	}

	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}

	public String getSource_of_borrowing() {
		return source_of_borrowing;
	}

	public void setSource_of_borrowing(String source_of_borrowing) {
		this.source_of_borrowing = source_of_borrowing;
	}

	public Integer getSquare_footage() {
		return square_footage;
	}

	public void setSquare_footage(Integer square_footage) {
		this.square_footage = square_footage;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public String getEmail_work() {
		return email_work;
	}

	public void setEmail_work(String email_work) {
		this.email_work = email_work;
	}

	public Boolean getIs_a_small_centre() {
		return is_a_small_centre;
	}

	public void setIs_a_small_centre(Boolean is_a_small_centre) {
		this.is_a_small_centre = is_a_small_centre;
	}

	public Double getSale_of_existing_amount() {
		return sale_of_existing_amount;
	}

	public void setSale_of_existing_amount(Double sale_of_existing_amount) {
		this.sale_of_existing_amount = sale_of_existing_amount;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public String getDesired_product_type() {
		return desired_product_type;
	}

	public void setDesired_product_type(String desired_product_type) {
		this.desired_product_type = desired_product_type;
	}

	public Boolean getIs_non_conv_construction() {
		return is_non_conv_construction;
	}

	public void setIs_non_conv_construction(Boolean is_non_conv_construction) {
		this.is_non_conv_construction = is_non_conv_construction;
	}

	public String getPartner_name() {
		return partner_name;
	}

	public void setPartner_name(String partner_name) {
		this.partner_name = partner_name;
	}

	public String getTerm_rate() {
		return term_rate;
	}

	public void setTerm_rate(String term_rate) {
		this.term_rate = term_rate;
	}

	public Boolean getProcess_presntedutio_check() {
		return process_presntedutio_check;
	}

	public void setProcess_presntedutio_check(Boolean process_presntedutio_check) {
		this.process_presntedutio_check = process_presntedutio_check;
	}

	public String getProperty_style() {
		return property_style;
	}

	public void setProperty_style(String property_style) {
		this.property_style = property_style;
	}

	public String getGarage_size() {
		return garage_size;
	}

	public void setGarage_size(String garage_size) {
		this.garage_size = garage_size;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTitle_action() {
		return title_action;
	}

	public void setTitle_action(String title_action) {
		this.title_action = title_action;
	}

	public String getOpp_info_start_date() {
		return opp_info_start_date;
	}

	public void setOpp_info_start_date(String opp_info_start_date) {
		this.opp_info_start_date = opp_info_start_date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public Boolean getHas_charges_behind() {
		return has_charges_behind;
	}

	public void setHas_charges_behind(Boolean has_charges_behind) {
		this.has_charges_behind = has_charges_behind;
	}

	public String getRenewaldate() {
		return renewaldate;
	}

	public void setRenewaldate(String renewaldate) {
		this.renewaldate = renewaldate;
	}

	public String getLender_name() {
		return lender_name;
	}

	public void setLender_name(String lender_name) {
		this.lender_name = lender_name;
	}

	public Double getDay_close() {
		return day_close;
	}

	public void setDay_close(Double day_close) {
		this.day_close = day_close;
	}

	public String getDate_closed() {
		return date_closed;
	}

	public void setDate_closed(String date_closed) {
		this.date_closed = date_closed;
	}

	public String getDown_payment_coming_from() {
		return down_payment_coming_from;
	}

	public void setDown_payment_coming_from(String down_payment_coming_from) {
		this.down_payment_coming_from = down_payment_coming_from;
	}

	public String getDate_deadline() {
		return date_deadline;
	}

	public void setDate_deadline(String date_deadline) {
		this.date_deadline = date_deadline;
	}

	public Boolean getApproached_check() {
		return approached_check;
	}

	public void setApproached_check(Boolean approached_check) {
		this.approached_check = approached_check;
	}

	public Double getDay_open() {
		return day_open;
	}

	public void setDay_open(Double day_open) {
		this.day_open = day_open;
	}

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public Double getCurrent_monthly_payment() {
		return current_monthly_payment;
	}

	public void setCurrent_monthly_payment(Double current_monthly_payment) {
		this.current_monthly_payment = current_monthly_payment;
	}

	public String getSewage() {
		return sewage;
	}

	public void setSewage(String sewage) {
		this.sewage = sewage;
	}

	public Boolean getIs_four_plex() {
		return is_four_plex;
	}

	public void setIs_four_plex(Boolean is_four_plex) {
		this.is_four_plex = is_four_plex;
	}

	public String getLifestyle_change() {
		return lifestyle_change;
	}

	public void setLifestyle_change(String lifestyle_change) {
		this.lifestyle_change = lifestyle_change;
	}

	public Double getLender_fee() {
		return lender_fee;
	}

	public void setLender_fee(Double lender_fee) {
		this.lender_fee = lender_fee;
	}

	public Boolean getPending_application_check() {
		return pending_application_check;
	}

	public void setPending_application_check(Boolean pending_application_check) {
		this.pending_application_check = pending_application_check;
	}

	public Boolean getIs_raw_land() {
		return is_raw_land;
	}

	public void setIs_raw_land(Boolean is_raw_land) {
		this.is_raw_land = is_raw_land;
	}

	public Boolean getIs_cottage_rec_property() {
		return is_cottage_rec_property;
	}

	public void setIs_cottage_rec_property(Boolean is_cottage_rec_property) {
		this.is_cottage_rec_property = is_cottage_rec_property;
	}

	public String getTownship_PID() {
		return Township_PID;
	}

	public void setTownship_PID(String township_PID) {
		Township_PID = township_PID;
	}

	public Double getRrsp_amount() {
		return rrsp_amount;
	}

	public void setRrsp_amount(Double rrsp_amount) {
		this.rrsp_amount = rrsp_amount;
	}

	public String getOpp_info_type() {
		return opp_info_type;
	}

	public void setOpp_info_type(String opp_info_type) {
		this.opp_info_type = opp_info_type;
	}

	public Double getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(Double purchase_price) {
		this.purchase_price = purchase_price;
	}

	public Boolean getIs_military() {
		return is_military;
	}

	public void setIs_military(Boolean is_military) {
		this.is_military = is_military;
	}

	public String getWork_phone() {
		return work_phone;
	}

	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}

	public String getFinancial_risk_taker() {
		return financial_risk_taker;
	}

	public void setFinancial_risk_taker(String financial_risk_taker) {
		this.financial_risk_taker = financial_risk_taker;
	}

	public Integer getLender() {
		return lender;
	}

	public void setLender(Integer lender) {
		this.lender = lender;
	}

	public Double getTrailer_comp_amount() {
		return trailer_comp_amount;
	}

	public void setTrailer_comp_amount(Double trailer_comp_amount) {
		this.trailer_comp_amount = trailer_comp_amount;
	}

	public String getOpp_info_renewal_date() {
		return opp_info_renewal_date;
	}

	public void setOpp_info_renewal_date(String opp_info_renewal_date) {
		this.opp_info_renewal_date = opp_info_renewal_date;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public Double getTDS() {
		return TDS;
	}

	public void setTDS(Double tDS) {
		TDS = tDS;
	}

	public String getLender_ref() {
		return lender_ref;
	}

	public void setLender_ref(String lender_ref) {
		this.lender_ref = lender_ref;
	}

	public Double getSweat_equity_amount() {
		return sweat_equity_amount;
	}

	public void setSweat_equity_amount(Double sweat_equity_amount) {
		this.sweat_equity_amount = sweat_equity_amount;
	}

	public String getInternal_notes_final() {
		return internal_notes_final;
	}

	public void setInternal_notes_final(String internal_notes_final) {
		this.internal_notes_final = internal_notes_final;
	}

	public Integer getSelected_product() {
		return selected_product;
	}

	public void setSelected_product(Integer selected_product) {
		this.selected_product = selected_product;
	}

	public Double getOther_amount() {
		return other_amount;
	}

	public void setOther_amount(Double other_amount) {
		this.other_amount = other_amount;
	}

	public String getWhat_is_your_lending_goal() {
		return what_is_your_lending_goal;
	}

	public void setWhat_is_your_lending_goal(String what_is_your_lending_goal) {
		this.what_is_your_lending_goal = what_is_your_lending_goal;
	}

	public Double getProbability() {
		return probability;
	}

	public void setProbability(Double probability) {
		this.probability = probability;
	}

	public Double getBank_account() {
		return bank_account;
	}

	public void setBank_account(Double bank_account) {
		this.bank_account = bank_account;
	}

	public Boolean getOpt_out() {
		return opt_out;
	}

	public void setOpt_out(Boolean opt_out) {
		this.opt_out = opt_out;
	}

	public Double getAcres() {
		return acres;
	}

	public void setAcres(Double acres) {
		this.acres = acres;
	}

	public String getEstimated_valueof_home() {
		return estimated_valueof_home;
	}

	public void setEstimated_valueof_home(String estimated_valueof_home) {
		this.estimated_valueof_home = estimated_valueof_home;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public Double getCurrent_interest_rate() {
		return current_interest_rate;
	}

	public void setCurrent_interest_rate(Double current_interest_rate) {
		this.current_interest_rate = current_interest_rate;
	}

	public String getCurrent_mortgage_type() {
		return current_mortgage_type;
	}

	public void setCurrent_mortgage_type(String current_mortgage_type) {
		this.current_mortgage_type = current_mortgage_type;
	}

	public Integer getCash_back() {
		return cash_back;
	}

	public void setCash_back(Integer cash_back) {
		this.cash_back = cash_back;
	}

	public Double getPlanned_cost() {
		return planned_cost;
	}

	public void setPlanned_cost(Double planned_cost) {
		this.planned_cost = planned_cost;
	}

	public Double getGifted_amount() {
		return gifted_amount;
	}

	public void setGifted_amount(Double gifted_amount) {
		this.gifted_amount = gifted_amount;
	}

	public Boolean getIs_rental_pools() {
		return is_rental_pools;
	}

	public void setIs_rental_pools(Boolean is_rental_pools) {
		this.is_rental_pools = is_rental_pools;
	}

	public String getLiving_in_property() {
		return living_in_property;
	}

	public void setLiving_in_property(String living_in_property) {
		this.living_in_property = living_in_property;
	}

	public Double getDown_payment_amount() {
		return down_payment_amount;
	}

	public void setDown_payment_amount(Double down_payment_amount) {
		this.down_payment_amount = down_payment_amount;
	}

	public Boolean getIs_fractional_interests() {
		return is_fractional_interests;
	}

	public void setIs_fractional_interests(Boolean is_fractional_interests) {
		this.is_fractional_interests = is_fractional_interests;
	}

	public String getProperty_less_then_5_years() {
		return property_less_then_5_years;
	}

	public void setProperty_less_then_5_years(String property_less_then_5_years) {
		this.property_less_then_5_years = property_less_then_5_years;
	}

	public Integer getOpp_info_loan_amnt() {
		return opp_info_loan_amnt;
	}

	public void setOpp_info_loan_amnt(Integer opp_info_loan_amnt) {
		this.opp_info_loan_amnt = opp_info_loan_amnt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeb_response() {
		return web_response;
	}

	public void setWeb_response(String web_response) {
		this.web_response = web_response;
	}

	public String getApartment_style() {
		return apartment_style;
	}

	public void setApartment_style(String apartment_style) {
		this.apartment_style = apartment_style;
	}

	public String getMls() {
		return mls;
	}

	public void setMls(String mls) {
		this.mls = mls;
	}

	public String getCurrent_renewal_date() {
		return current_renewal_date;
	}

	public void setCurrent_renewal_date(String current_renewal_date) {
		this.current_renewal_date = current_renewal_date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIs_commercial() {
		return is_commercial;
	}

	public void setIs_commercial(Boolean is_commercial) {
		this.is_commercial = is_commercial;
	}

	public Double getDistance_to_major_center() {
		return distance_to_major_center;
	}

	public void setDistance_to_major_center(Double distance_to_major_center) {
		this.distance_to_major_center = distance_to_major_center;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDate_open() {
		return date_open;
	}

	public void setDate_open(String date_open) {
		this.date_open = date_open;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getInternal_note() {
		return internal_note;
	}

	public void setInternal_note(String internal_note) {
		this.internal_note = internal_note;
	}

	public Double getVolume_bonus_amount() {
		return volume_bonus_amount;
	}

	public void setVolume_bonus_amount(Double volume_bonus_amount) {
		this.volume_bonus_amount = volume_bonus_amount;
	}

	public Boolean getIs_construction_mortgage() {
		return is_construction_mortgage;
	}

	public void setIs_construction_mortgage(Boolean is_construction_mortgage) {
		this.is_construction_mortgage = is_construction_mortgage;
	}

	public String getOpen_closed() {
		return open_closed;
	}

	public void setOpen_closed(String open_closed) {
		this.open_closed = open_closed;
	}

	public String getRef2() {
		return ref2;
	}

	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}

	public String getDate_action_next() {
		return date_action_next;
	}

	public void setDate_action_next(String date_action_next) {
		this.date_action_next = date_action_next;
	}

	public Boolean getMaximum_amount() {
		return maximum_amount;
	}

	public void setMaximum_amount(Boolean maximum_amount) {
		this.maximum_amount = maximum_amount;
	}

	public Double getTotal_one_time_fees() {
		return total_one_time_fees;
	}

	public void setTotal_one_time_fees(Double total_one_time_fees) {
		this.total_one_time_fees = total_one_time_fees;
	}

	public String getRenter_pay_heating() {
		return renter_pay_heating;
	}

	public void setRenter_pay_heating(String renter_pay_heating) {
		this.renter_pay_heating = renter_pay_heating;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getDownpayment_amount() {
		return downpayment_amount;
	}

	public void setDownpayment_amount(Double downpayment_amount) {
		this.downpayment_amount = downpayment_amount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getBase_commission() {
		return base_commission;
	}

	public void setBase_commission(Double base_commission) {
		this.base_commission = base_commission;
	}

	public Double getInsurerfee() {
		return insurerfee;
	}

	public void setInsurerfee(Double insurerfee) {
		this.insurerfee = insurerfee;
	}

	public String getBuilding_funds() {
		return building_funds;
	}

	public void setBuilding_funds(String building_funds) {
		this.building_funds = building_funds;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPreferred_number() {
		return preferred_number;
	}

	public void setPreferred_number(String preferred_number) {
		this.preferred_number = preferred_number;
	}

	public Double getCommitment_fee() {
		return commitment_fee;
	}

	public void setCommitment_fee(Double commitment_fee) {
		this.commitment_fee = commitment_fee;
	}

	public String getCredit_story() {
		return credit_story;
	}

	public void setCredit_story(String credit_story) {
		this.credit_story = credit_story;
	}

	public String getReferred_source() {
		return referred_source;
	}

	public void setReferred_source(String referred_source) {
		this.referred_source = referred_source;
	}

	public String getClosing_date() {
		return closing_date;
	}

	public void setClosing_date(String closing_date) {
		this.closing_date = closing_date;
	}

	public String getMorweb_filogix() {
		return morweb_filogix;
	}

	public void setMorweb_filogix(String morweb_filogix) {
		this.morweb_filogix = morweb_filogix;
	}

	public Boolean getIs_eight_plex() {
		return is_eight_plex;
	}

	public void setIs_eight_plex(Boolean is_eight_plex) {
		this.is_eight_plex = is_eight_plex;
	}

	public String getInternal_notes() {
		return internal_notes;
	}

	public void setInternal_notes(String internal_notes) {
		this.internal_notes = internal_notes;
	}

	public Double getProperty_value() {
		return property_value;
	}

	public void setProperty_value(Double property_value) {
		this.property_value = property_value;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Integer getDesired_amortization() {
		return desired_amortization;
	}

	public void setDesired_amortization(Integer desired_amortization) {
		this.desired_amortization = desired_amortization;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIs_six_plex() {
		return is_six_plex;
	}

	public void setIs_six_plex(Boolean is_six_plex) {
		this.is_six_plex = is_six_plex;
	}

	public Double getBorrowed_amount() {
		return borrowed_amount;
	}

	public void setBorrowed_amount(Double borrowed_amount) {
		this.borrowed_amount = borrowed_amount;
	}

	public String getState_id() {
		return state_id;
	}

	public void setState_id(String state_id) {
		this.state_id = state_id;
	}

	public String getDocument_fields() {
		return document_fields;
	}

	public void setDocument_fields(String document_fields) {
		this.document_fields = document_fields;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public String getCongrats_date() {
		return congrats_date;
	}

	public void setCongrats_date(String congrats_date) {
		this.congrats_date = congrats_date;
	}

	public int getOpportunity_id() {
		return opportunity_id;
	}

	public void setOpportunity_id(int opportunity_id) {
		this.opportunity_id = opportunity_id;
	}

	public String getTo_pages() {
		return to_pages;
	}

	public void setTo_pages(String to_pages) {
		this.to_pages = to_pages;
	}

	public String getX_bypass_proposal() {
		return x_bypass_proposal;
	}

	public void setX_bypass_proposal(String x_bypass_proposal) {
		this.x_bypass_proposal = x_bypass_proposal;
	}

	public String getDup_task_created() {
		return dup_task_created;
	}

	public void setDup_task_created(String dup_task_created) {
		this.dup_task_created = dup_task_created;
	}

	public String getLooking_to() {
		return looking_to;
	}

	public void setLooking_to(String looking_to) {
		this.looking_to = looking_to;
	}

	public String getClient_email_rem() {
		return client_email_rem;
	}

	public void setClient_email_rem(String client_email_rem) {
		this.client_email_rem = client_email_rem;
	}

	public String getFinal_documents() {
		return final_documents;
	}

	public void setFinal_documents(String final_documents) {
		this.final_documents = final_documents;
	}

	public String getProd_count() {
		return prod_count;
	}

	public void setProd_count(String prod_count) {
		this.prod_count = prod_count;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(String create_uid) {
		this.create_uid = create_uid;
	}

	public String getTraining_associate_referral() {
		return training_associate_referral;
	}

	public void setTraining_associate_referral(
			String training_associate_referral) {
		this.training_associate_referral = training_associate_referral;
	}

	public String getGreeting_send() {
		return greeting_send;
	}

	public void setGreeting_send(String greeting_send) {
		this.greeting_send = greeting_send;
	}

	public String getFax1() {
		return fax1;
	}

	public void setFax1(String fax1) {
		this.fax1 = fax1;
	}

	public String getRenewal_reminder() {
		return renewal_reminder;
	}

	public void setRenewal_reminder(String renewal_reminder) {
		this.renewal_reminder = renewal_reminder;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getLead_followup_date() {
		return lead_followup_date;
	}

	public void setLead_followup_date(String lead_followup_date) {
		this.lead_followup_date = lead_followup_date;
	}

	public String getDesired_term() {
		return desired_term;
	}

	public void setDesired_term(String desired_term) {
		this.desired_term = desired_term;
	}

	public String getRenewal_email_send() {
		return renewal_email_send;
	}

	public void setRenewal_email_send(String renewal_email_send) {
		this.renewal_email_send = renewal_email_send;
	}

	public String getDelayed_app_date() {
		return delayed_app_date;
	}

	public void setDelayed_app_date(String delayed_app_date) {
		this.delayed_app_date = delayed_app_date;
	}

	public String getX_selected_recommendation() {
		return x_selected_recommendation;
	}

	public void setX_selected_recommendation(String x_selected_recommendation) {
		this.x_selected_recommendation = x_selected_recommendation;
	}

	public Double getReferral_fee() {
		return referral_fee;
	}

	public void setReferral_fee(Double referral_fee) {
		this.referral_fee = referral_fee;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getTrainee() {
		return trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPropsal_date() {
		return propsal_date;
	}

	public void setPropsal_date(String propsal_date) {
		this.propsal_date = propsal_date;
	}

	public Double getPrivate_fee() {
		return private_fee;
	}

	public void setPrivate_fee(Double private_fee) {
		this.private_fee = private_fee;
	}

	public String getNew_opp_users() {
		return new_opp_users;
	}

	public void setNew_opp_users(String new_opp_users) {
		this.new_opp_users = new_opp_users;
	}

	public String getVolume_commission() {
		return volume_commission;
	}

	public void setVolume_commission(String volume_commission) {
		this.volume_commission = volume_commission;
	}

	public String getPost_selection() {
		return post_selection;
	}

	public void setPost_selection(String post_selection) {
		this.post_selection = post_selection;
	}

	public String getLead_followed() {
		return lead_followed;
	}

	public void setLead_followed(String lead_followed) {
		this.lead_followed = lead_followed;
	}

	public String getAll_email_ids() {
		return all_email_ids;
	}

	public void setAll_email_ids(String all_email_ids) {
		this.all_email_ids = all_email_ids;
	}

	public String getWebform_uname() {
		return webform_uname;
	}

	public void setWebform_uname(String webform_uname) {
		this.webform_uname = webform_uname;
	}

	public String getTemplate_date() {
		return template_date;
	}

	public void setTemplate_date(String template_date) {
		this.template_date = template_date;
	}

	public Boolean getIs_uninsured_conv_2nd_home() {
		return is_uninsured_conv_2nd_home;
	}

	public void setIs_uninsured_conv_2nd_home(Boolean is_uninsured_conv_2nd_home) {
		this.is_uninsured_conv_2nd_home = is_uninsured_conv_2nd_home;
	}

	public String getRenewal_mail_date() {
		return renewal_mail_date;
	}

	public void setRenewal_mail_date(String renewal_mail_date) {
		this.renewal_mail_date = renewal_mail_date;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public String getStage_id() {
		return stage_id;
	}

	public void setStage_id(String stage_id) {
		this.stage_id = stage_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNeeds_power_attorney() {
		return needs_power_attorney;
	}

	public void setNeeds_power_attorney(String needs_power_attorney) {
		this.needs_power_attorney = needs_power_attorney;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCurrent_mortgage_product() {
		return current_mortgage_product;
	}

	public void setCurrent_mortgage_product(String current_mortgage_product) {
		this.current_mortgage_product = current_mortgage_product;
	}

	public String getX_base_ltv() {
		return x_base_ltv;
	}

	public void setX_base_ltv(String x_base_ltv) {
		this.x_base_ltv = x_base_ltv;
	}

	public String getType_id() {
		return type_id;
	}

	public void setType_id(String type_id) {
		this.type_id = type_id;
	}

	public String getSales_associate() {
		return sales_associate;
	}

	public void setSales_associate(String sales_associate) {
		this.sales_associate = sales_associate;
	}

	public String getLooking_fora() {
		return looking_fora;
	}

	public void setLooking_fora(String looking_fora) {
		this.looking_fora = looking_fora;
	}

	public String getWebform_pwd() {
		return webform_pwd;
	}

	public void setWebform_pwd(String webform_pwd) {
		this.webform_pwd = webform_pwd;
	}

	public String getDelayed_app_task() {
		return delayed_app_task;
	}

	public void setDelayed_app_task(String delayed_app_task) {
		this.delayed_app_task = delayed_app_task;
	}

	public String getUnderwriter() {
		return underwriter;
	}

	public void setUnderwriter(String underwriter) {
		this.underwriter = underwriter;
	}

	public String getX_company() {
		return x_company;
	}

	public void setX_company(String x_company) {
		this.x_company = x_company;
	}

	public String getHr_department_id() {
		return hr_department_id;
	}

	public void setHr_department_id(String hr_department_id) {
		this.hr_department_id = hr_department_id;
	}

	public String getExisting_payout_penalty() {
		return existing_payout_penalty;
	}

	public void setExisting_payout_penalty(String existing_payout_penalty) {
		this.existing_payout_penalty = existing_payout_penalty;
	}

	public String getWrite_uid() {
		return write_uid;
	}

	public void setWrite_uid(String write_uid) {
		this.write_uid = write_uid;
	}

	public String getSection_id() {
		return section_id;
	}

	public void setSection_id(String section_id) {
		this.section_id = section_id;
	}

	public String getCurrent_lender_moved0() {
		return current_lender_moved0;
	}

	public void setCurrent_lender_moved0(String current_lender_moved0) {
		this.current_lender_moved0 = current_lender_moved0;
	}

	public String getDate_renewed() {
		return date_renewed;
	}

	public void setDate_renewed(String date_renewed) {
		this.date_renewed = date_renewed;
	}

	public String getLawyer() {
		return lawyer;
	}

	public void setLawyer(String lawyer) {
		this.lawyer = lawyer;
	}

	public String getCompleted_ref() {
		return completed_ref;
	}

	public void setCompleted_ref(String completed_ref) {
		this.completed_ref = completed_ref;
	}

	public String getAll_product_clicked() {
		return all_product_clicked;
	}

	public void setAll_product_clicked(String all_product_clicked) {
		this.all_product_clicked = all_product_clicked;
	}

	public Boolean getTask_created() {
		return task_created;
	}

	public void setTask_created(Boolean task_created) {
		this.task_created = task_created;
	}

	public String getFrom_web_form() {
		return from_web_form;
	}

	public void setFrom_web_form(String from_web_form) {
		this.from_web_form = from_web_form;
	}

	public String getFrom_pages() {
		return from_pages;
	}

	public void setFrom_pages(String from_pages) {
		this.from_pages = from_pages;
	}

	public String getPlus_minus_prime() {
		return plus_minus_prime;
	}

	public void setPlus_minus_prime(String plus_minus_prime) {
		this.plus_minus_prime = plus_minus_prime;
	}

	public String getConsidered_cites() {
		return considered_cites;
	}

	public void setConsidered_cites(String considered_cites) {
		this.considered_cites = considered_cites;
	}

	public String getWelcum_email_date() {
		return welcum_email_date;
	}

	public void setWelcum_email_date(String welcum_email_date) {
		this.welcum_email_date = welcum_email_date;
	}

	public String getClient_remd() {
		return client_remd;
	}

	public void setClient_remd(String client_remd) {
		this.client_remd = client_remd;
	}

	public String getDesired_amortization_moved1() {
		return desired_amortization_moved1;
	}

	public void setDesired_amortization_moved1(
			String desired_amortization_moved1) {
		this.desired_amortization_moved1 = desired_amortization_moved1;
	}

	public String getDesired_amortization_moved0() {
		return desired_amortization_moved0;
	}

	public void setDesired_amortization_moved0(
			String desired_amortization_moved0) {
		this.desired_amortization_moved0 = desired_amortization_moved0;
	}

	public String getClient_survey() {
		return client_survey;
	}

	public void setClient_survey(String client_survey) {
		this.client_survey = client_survey;
	}

	public String getAmortization() {
		return amortization;
	}

	public void setAmortization(String amortization) {
		this.amortization = amortization;
	}

	@Override
	public String toString() {
		return "Opportunity [referral_source=" + referral_source
				+ ", is_agricultural=" + is_agricultural
				+ ", secondary_financing_amount=" + secondary_financing_amount
				+ ", charge_on_title=" + charge_on_title
				+ ", is_rental_property=" + is_rental_property
				+ ", total_comp_amount=" + total_comp_amount
				+ ", date_created_co_applicant=" + date_created_co_applicant
				+ ", application_no=" + application_no + ", is_rooming_houses="
				+ is_rooming_houses + ", lot_size=" + lot_size
				+ ", condo_fees=" + condo_fees + ", lot=" + lot + ", referred="
				+ referred + ", base_comp_amount=" + base_comp_amount
				+ ", applicant_last_name=" + applicant_last_name
				+ ", is_duplex=" + is_duplex + ", total_mortgage_amount="
				+ total_mortgage_amount + ", existing_equity_amount="
				+ existing_equity_amount + ", current_mortgage_amount="
				+ current_mortgage_amount + ", future_family=" + future_family
				+ ", write_date=" + write_date
				+ ", condition_of_financing_date="
				+ condition_of_financing_date + ", final_lender="
				+ final_lender + ", desired_mortgage_type="
				+ desired_mortgage_type + ", is_high_ratio_2nd_home="
				+ is_high_ratio_2nd_home + ", marketing_comp_amount="
				+ marketing_comp_amount + ", draws_required=" + draws_required
				+ ", is_condo=" + is_condo + ", lender_response="
				+ lender_response + ", is_boarding_houses="
				+ is_boarding_houses + ", is_grow_ops=" + is_grow_ops
				+ ", outbuildings_value=" + outbuildings_value
				+ ", non_income_qualifer=" + non_income_qualifer
				+ ", is_modular_homes=" + is_modular_homes
				+ ", renovation_value=" + renovation_value
				+ ", is_co_operative_housing=" + is_co_operative_housing
				+ ", current_balance=" + current_balance
				+ ", monthly_rental_income=" + monthly_rental_income
				+ ", mortgage_type=" + mortgage_type + ", GDS=" + GDS
				+ ", isUpdatedToUA=" + isUpdatedToUA + ", broker_fee="
				+ broker_fee + ", insurerref=" + insurerref
				+ ", current_lender=" + current_lender + ", spouse=" + spouse
				+ ", is_agricultural_less_10_acres="
				+ is_agricultural_less_10_acres + ", email_from=" + email_from
				+ ", expected_closing_date=" + expected_closing_date
				+ ", is_life_leased_property=" + is_life_leased_property
				+ ", partner_id=" + partner_id + ", date_action_last="
				+ date_action_last + ", buy_new_vehicle=" + buy_new_vehicle
				+ ", is_mobile_homes=" + is_mobile_homes
				+ ", is_age_restricted=" + is_age_restricted
				+ ", monthly_payment=" + monthly_payment + ", existing_lender="
				+ existing_lender + ", future_mortgage=" + future_mortgage
				+ ", marketing_auto=" + marketing_auto + ", verify_product="
				+ verify_product + ", personal_cash_amount="
				+ personal_cash_amount + ", new_home_warranty="
				+ new_home_warranty + ", is_country_residential="
				+ is_country_residential + ", ltv=" + ltv
				+ ", lender_requires_insurance=" + lender_requires_insurance
				+ ", internal_note_property=" + internal_note_property
				+ ", concerns_addressed_check=" + concerns_addressed_check
				+ ", priority=" + priority + ", description=" + description
				+ ", province=" + province + ", planned_revenue="
				+ planned_revenue + ", op_info_type=" + op_info_type + ", fax="
				+ fax + ", date_action=" + date_action + ", email_cc="
				+ email_cc + ", income_decreased_worried="
				+ income_decreased_worried + ", mortgage_insured="
				+ mortgage_insured + ", existing_mortgage=" + existing_mortgage
				+ ", min_heat_fee=" + min_heat_fee + ", lead_source="
				+ lead_source + ", qualified_check=" + qualified_check
				+ ", postal_code=" + postal_code + ", active=" + active
				+ ", property_taxes=" + property_taxes + ", is_floating_homes="
				+ is_floating_homes + ", mobile=" + mobile + ", opp_info_rate="
				+ opp_info_rate + ", charges_behind_amount="
				+ charges_behind_amount + ", application_date="
				+ application_date + ", realtor=" + realtor + ", garage_type="
				+ garage_type + ", name=" + name + ", desired_mortgage_amount="
				+ desired_mortgage_amount + ", product_type=" + product_type
				+ ", is_leased_land=" + is_leased_land + ", job_5_years="
				+ job_5_years + ", property_type=" + property_type
				+ ", source_of_borrowing=" + source_of_borrowing
				+ ", square_footage=" + square_footage + ", color=" + color
				+ ", email_work=" + email_work + ", is_a_small_centre="
				+ is_a_small_centre + ", sale_of_existing_amount="
				+ sale_of_existing_amount + ", heating=" + heating
				+ ", desired_product_type=" + desired_product_type
				+ ", is_non_conv_construction=" + is_non_conv_construction
				+ ", partner_name=" + partner_name + ", term_rate=" + term_rate
				+ ", process_presntedutio_check=" + process_presntedutio_check
				+ ", property_style=" + property_style + ", garage_size="
				+ garage_size + ", street=" + street + ", title_action="
				+ title_action + ", opp_info_start_date=" + opp_info_start_date
				+ ", city=" + city + ", create_date=" + create_date
				+ ", has_charges_behind=" + has_charges_behind
				+ ", renewaldate=" + renewaldate + ", lender_name="
				+ lender_name + ", day_close=" + day_close + ", date_closed="
				+ date_closed + ", down_payment_coming_from="
				+ down_payment_coming_from + ", date_deadline=" + date_deadline
				+ ", approached_check=" + approached_check + ", day_open="
				+ day_open + ", insurer=" + insurer
				+ ", current_monthly_payment=" + current_monthly_payment
				+ ", sewage=" + sewage + ", is_four_plex=" + is_four_plex
				+ ", lifestyle_change=" + lifestyle_change + ", lender_fee="
				+ lender_fee + ", pending_application_check="
				+ pending_application_check + ", is_raw_land=" + is_raw_land
				+ ", is_cottage_rec_property=" + is_cottage_rec_property
				+ ", Township_PID=" + Township_PID + ", rrsp_amount="
				+ rrsp_amount + ", opp_info_type=" + opp_info_type
				+ ", purchase_price=" + purchase_price + ", is_military="
				+ is_military + ", work_phone=" + work_phone
				+ ", financial_risk_taker=" + financial_risk_taker
				+ ", lender=" + lender + ", trailer_comp_amount="
				+ trailer_comp_amount + ", opp_info_renewal_date="
				+ opp_info_renewal_date + ", block=" + block + ", TDS=" + TDS
				+ ", lender_ref=" + lender_ref + ", sweat_equity_amount="
				+ sweat_equity_amount + ", internal_notes_final="
				+ internal_notes_final + ", selected_product="
				+ selected_product + ", other_amount=" + other_amount
				+ ", what_is_your_lending_goal=" + what_is_your_lending_goal
				+ ", probability=" + probability + ", bank_account="
				+ bank_account + ", opt_out=" + opt_out + ", acres=" + acres
				+ ", estimated_valueof_home=" + estimated_valueof_home
				+ ", water=" + water + ", trigger=" + trigger
				+ ", current_interest_rate=" + current_interest_rate
				+ ", current_mortgage_type=" + current_mortgage_type
				+ ", cash_back=" + cash_back + ", planned_cost=" + planned_cost
				+ ", gifted_amount=" + gifted_amount + ", is_rental_pools="
				+ is_rental_pools + ", living_in_property="
				+ living_in_property + ", down_payment_amount="
				+ down_payment_amount + ", is_fractional_interests="
				+ is_fractional_interests + ", property_less_then_5_years="
				+ property_less_then_5_years + ", opp_info_loan_amnt="
				+ opp_info_loan_amnt + ", phone=" + phone + ", web_response="
				+ web_response + ", apartment_style=" + apartment_style
				+ ", mls=" + mls + ", current_renewal_date="
				+ current_renewal_date + ", type=" + type + ", is_commercial="
				+ is_commercial + ", distance_to_major_center="
				+ distance_to_major_center + ", function=" + function
				+ ", age=" + age + ", date_open=" + date_open
				+ ", contact_name=" + contact_name + ", internal_note="
				+ internal_note + ", volume_bonus_amount="
				+ volume_bonus_amount + ", is_construction_mortgage="
				+ is_construction_mortgage + ", amortization=" + amortization
				+ ", open_closed=" + open_closed + ", ref2=" + ref2
				+ ", date_action_next=" + date_action_next
				+ ", maximum_amount=" + maximum_amount
				+ ", total_one_time_fees=" + total_one_time_fees
				+ ", renter_pay_heating=" + renter_pay_heating + ", state="
				+ state + ", id=" + id + ", downpayment_amount="
				+ downpayment_amount + ", rate=" + rate + ", base_commission="
				+ base_commission + ", insurerfee=" + insurerfee
				+ ", building_funds=" + building_funds + ", street2=" + street2
				+ ", zip=" + zip + ", preferred_number=" + preferred_number
				+ ", commitment_fee=" + commitment_fee + ", credit_story="
				+ credit_story + ", referred_source=" + referred_source
				+ ", closing_date=" + closing_date + ", morweb_filogix="
				+ morweb_filogix + ", is_eight_plex=" + is_eight_plex
				+ ", internal_notes=" + internal_notes + ", property_value="
				+ property_value + ", plan=" + plan + ", desired_amortization="
				+ desired_amortization + ", term=" + term + ", address="
				+ address + ", is_six_plex=" + is_six_plex
				+ ", borrowed_amount=" + borrowed_amount + ", state_id="
				+ state_id + ", document_fields=" + document_fields
				+ ", assistant=" + assistant + ", congrats_date="
				+ congrats_date + ", opportunity_id=" + opportunity_id
				+ ", to_pages=" + to_pages + ", x_bypass_proposal="
				+ x_bypass_proposal + ", dup_task_created=" + dup_task_created
				+ ", looking_to=" + looking_to + ", client_email_rem="
				+ client_email_rem + ", final_documents=" + final_documents
				+ ", prod_count=" + prod_count + ", deadline=" + deadline
				+ ", create_uid=" + create_uid
				+ ", training_associate_referral="
				+ training_associate_referral + ", greeting_send="
				+ greeting_send + ", fax1=" + fax1 + ", renewal_reminder="
				+ renewal_reminder + ", ref=" + ref + ", payment_mode="
				+ payment_mode + ", lead_followup_date=" + lead_followup_date
				+ ", desired_term=" + desired_term + ", renewal_email_send="
				+ renewal_email_send + ", delayed_app_date=" + delayed_app_date
				+ ", x_selected_recommendation=" + x_selected_recommendation
				+ ", referral_fee=" + referral_fee + ", company_id="
				+ company_id + ", frequency=" + frequency + ", trainee="
				+ trainee + ", user_id=" + user_id + ", propsal_date="
				+ propsal_date + ", private_fee=" + private_fee
				+ ", new_opp_users=" + new_opp_users + ", volume_commission="
				+ volume_commission + ", post_selection=" + post_selection
				+ ", lead_followed=" + lead_followed + ", all_email_ids="
				+ all_email_ids + ", webform_uname=" + webform_uname
				+ ", template_date=" + template_date
				+ ", is_uninsured_conv_2nd_home=" + is_uninsured_conv_2nd_home
				+ ", renewal_mail_date=" + renewal_mail_date + ", channel_id="
				+ channel_id + ", stage_id=" + stage_id + ", title=" + title
				+ ", needs_power_attorney=" + needs_power_attorney
				+ ", country_id=" + country_id + ", current_mortgage_product="
				+ current_mortgage_product + ", x_base_ltv=" + x_base_ltv
				+ ", type_id=" + type_id + ", sales_associate="
				+ sales_associate + ", looking_fora=" + looking_fora
				+ ", webform_pwd=" + webform_pwd + ", delayed_app_task="
				+ delayed_app_task + ", underwriter=" + underwriter
				+ ", x_company=" + x_company + ", hr_department_id="
				+ hr_department_id + ", existing_payout_penalty="
				+ existing_payout_penalty + ", write_uid=" + write_uid
				+ ", section_id=" + section_id + ", current_lender_moved0="
				+ current_lender_moved0 + ", date_renewed=" + date_renewed
				+ ", lawyer=" + lawyer + ", completed_ref=" + completed_ref
				+ ", all_product_clicked=" + all_product_clicked
				+ ", task_created=" + task_created + ", from_web_form="
				+ from_web_form + ", from_pages=" + from_pages
				+ ", plus_minus_prime=" + plus_minus_prime
				+ ", considered_cites=" + considered_cites
				+ ", welcum_email_date=" + welcum_email_date + ", client_remd="
				+ client_remd + ", desired_amortization_moved1="
				+ desired_amortization_moved1
				+ ", desired_amortization_moved0="
				+ desired_amortization_moved0 + ", client_survey="
				+ client_survey + ", getReferral_source()="
				+ getReferral_source() + ", getIs_agricultural()="
				+ getIs_agricultural() + ", getSecondary_financing_amount()="
				+ getSecondary_financing_amount() + ", getCharge_on_title()="
				+ getCharge_on_title() + ", getIs_rental_property()="
				+ getIs_rental_property() + ", getTotal_comp_amount()="
				+ getTotal_comp_amount() + ", getDate_created_co_applicant()="
				+ getDate_created_co_applicant() + ", getApplication_no()="
				+ getApplication_no() + ", getIs_rooming_houses()="
				+ getIs_rooming_houses() + ", getLot_size()=" + getLot_size()
				+ ", getCondo_fees()=" + getCondo_fees() + ", getLot()="
				+ getLot() + ", getReferred()=" + getReferred()
				+ ", getBase_comp_amount()=" + getBase_comp_amount()
				+ ", getApplicant_last_name()=" + getApplicant_last_name()
				+ ", getIs_duplex()=" + getIs_duplex()
				+ ", getTotal_mortgage_amount()=" + getTotal_mortgage_amount()
				+ ", getExisting_equity_amount()="
				+ getExisting_equity_amount()
				+ ", getCurrent_mortgage_amount()="
				+ getCurrent_mortgage_amount() + ", getFuture_family()="
				+ getFuture_family() + ", getWrite_date()=" + getWrite_date()
				+ ", getCondition_of_financing_date()="
				+ getCondition_of_financing_date() + ", getFinal_lender()="
				+ getFinal_lender() + ", getDesired_mortgage_type()="
				+ getDesired_mortgage_type() + ", getIs_high_ratio_2nd_home()="
				+ getIs_high_ratio_2nd_home() + ", getMarketing_comp_amount()="
				+ getMarketing_comp_amount() + ", getDraws_required()="
				+ getDraws_required() + ", getIs_condo()=" + getIs_condo()
				+ ", getLender_response()=" + getLender_response()
				+ ", getIs_boarding_houses()=" + getIs_boarding_houses()
				+ ", getIs_grow_ops()=" + getIs_grow_ops()
				+ ", getOutbuildings_value()=" + getOutbuildings_value()
				+ ", getNon_income_qualifer()=" + getNon_income_qualifer()
				+ ", getIs_modular_homes()=" + getIs_modular_homes()
				+ ", getRenovation_value()=" + getRenovation_value()
				+ ", getIs_co_operative_housing()="
				+ getIs_co_operative_housing() + ", getCurrent_balance()="
				+ getCurrent_balance() + ", getMonthly_rental_income()="
				+ getMonthly_rental_income() + ", getMortgage_type()="
				+ getMortgage_type() + ", getGDS()=" + getGDS()
				+ ", getIsUpdatedToUA()=" + getIsUpdatedToUA()
				+ ", getBroker_fee()=" + getBroker_fee() + ", getInsurerref()="
				+ getInsurerref() + ", getCurrent_lender()="
				+ getCurrent_lender() + ", getSpouse()=" + getSpouse()
				+ ", getIs_agricultural_less_10_acres()="
				+ getIs_agricultural_less_10_acres() + ", getEmail_from()="
				+ getEmail_from() + ", getExpected_closing_date()="
				+ getExpected_closing_date()
				+ ", getIs_life_leased_property()="
				+ getIs_life_leased_property() + ", getPartner_id()="
				+ getPartner_id() + ", getDate_action_last()="
				+ getDate_action_last() + ", getBuy_new_vehicle()="
				+ getBuy_new_vehicle() + ", getIs_mobile_homes()="
				+ getIs_mobile_homes() + ", getIs_age_restricted()="
				+ getIs_age_restricted() + ", getMonthly_payment()="
				+ getMonthly_payment() + ", getExisting_lender()="
				+ getExisting_lender() + ", getFuture_mortgage()="
				+ getFuture_mortgage() + ", getMarketing_auto()="
				+ getMarketing_auto() + ", getVerify_product()="
				+ getVerify_product() + ", getPersonal_cash_amount()="
				+ getPersonal_cash_amount() + ", getNew_home_warranty()="
				+ getNew_home_warranty() + ", getIs_country_residential()="
				+ getIs_country_residential() + ", getLtv()=" + getLtv()
				+ ", getLender_requires_insurance()="
				+ getLender_requires_insurance()
				+ ", getInternal_note_property()="
				+ getInternal_note_property()
				+ ", getConcerns_addressed_check()="
				+ getConcerns_addressed_check() + ", getPriority()="
				+ getPriority() + ", getDescription()=" + getDescription()
				+ ", getProvince()=" + getProvince()
				+ ", getPlanned_revenue()=" + getPlanned_revenue()
				+ ", getOp_info_type()=" + getOp_info_type() + ", getFax()="
				+ getFax() + ", getDate_action()=" + getDate_action()
				+ ", getEmail_cc()=" + getEmail_cc()
				+ ", getIncome_decreased_worried()="
				+ getIncome_decreased_worried() + ", getMortgage_insured()="
				+ getMortgage_insured() + ", getExisting_mortgage()="
				+ getExisting_mortgage() + ", getMin_heat_fee()="
				+ getMin_heat_fee() + ", getLead_source()=" + getLead_source()
				+ ", getQualified_check()=" + getQualified_check()
				+ ", getPostal_code()=" + getPostal_code() + ", getActive()="
				+ getActive() + ", getProperty_taxes()=" + getProperty_taxes()
				+ ", getIs_floating_homes()=" + getIs_floating_homes()
				+ ", getMobile()=" + getMobile() + ", getOpp_info_rate()="
				+ getOpp_info_rate() + ", getCharges_behind_amount()="
				+ getCharges_behind_amount() + ", getApplication_date()="
				+ getApplication_date() + ", getRealtor()=" + getRealtor()
				+ ", getGarage_type()=" + getGarage_type() + ", getName()="
				+ getName() + ", getDesired_mortgage_amount()="
				+ getDesired_mortgage_amount() + ", getProduct_type()="
				+ getProduct_type() + ", getIs_leased_land()="
				+ getIs_leased_land() + ", getJob_5_years()="
				+ getJob_5_years() + ", getProperty_type()="
				+ getProperty_type() + ", getSource_of_borrowing()="
				+ getSource_of_borrowing() + ", getSquare_footage()="
				+ getSquare_footage() + ", getColor()=" + getColor()
				+ ", getEmail_work()=" + getEmail_work()
				+ ", getIs_a_small_centre()=" + getIs_a_small_centre()
				+ ", getSale_of_existing_amount()="
				+ getSale_of_existing_amount() + ", getHeating()="
				+ getHeating() + ", getDesired_product_type()="
				+ getDesired_product_type()
				+ ", getIs_non_conv_construction()="
				+ getIs_non_conv_construction() + ", getPartner_name()="
				+ getPartner_name() + ", getTerm_rate()=" + getTerm_rate()
				+ ", getProcess_presntedutio_check()="
				+ getProcess_presntedutio_check() + ", getProperty_style()="
				+ getProperty_style() + ", getGarage_size()="
				+ getGarage_size() + ", getStreet()=" + getStreet()
				+ ", getTitle_action()=" + getTitle_action()
				+ ", getOpp_info_start_date()=" + getOpp_info_start_date()
				+ ", getCity()=" + getCity() + ", getCreate_date()="
				+ getCreate_date() + ", getHas_charges_behind()="
				+ getHas_charges_behind() + ", getRenewaldate()="
				+ getRenewaldate() + ", getLender_name()=" + getLender_name()
				+ ", getDay_close()=" + getDay_close() + ", getDate_closed()="
				+ getDate_closed() + ", getDown_payment_coming_from()="
				+ getDown_payment_coming_from() + ", getDate_deadline()="
				+ getDate_deadline() + ", getApproached_check()="
				+ getApproached_check() + ", getDay_open()=" + getDay_open()
				+ ", getInsurer()=" + getInsurer()
				+ ", getCurrent_monthly_payment()="
				+ getCurrent_monthly_payment() + ", getSewage()=" + getSewage()
				+ ", getIs_four_plex()=" + getIs_four_plex()
				+ ", getLifestyle_change()=" + getLifestyle_change()
				+ ", getLender_fee()=" + getLender_fee()
				+ ", getPending_application_check()="
				+ getPending_application_check() + ", getIs_raw_land()="
				+ getIs_raw_land() + ", getIs_cottage_rec_property()="
				+ getIs_cottage_rec_property() + ", getTownship_PID()="
				+ getTownship_PID() + ", getRrsp_amount()=" + getRrsp_amount()
				+ ", getOpp_info_type()=" + getOpp_info_type()
				+ ", getPurchase_price()=" + getPurchase_price()
				+ ", getIs_military()=" + getIs_military()
				+ ", getWork_phone()=" + getWork_phone()
				+ ", getFinancial_risk_taker()=" + getFinancial_risk_taker()
				+ ", getLender()=" + getLender()
				+ ", getTrailer_comp_amount()=" + getTrailer_comp_amount()
				+ ", getOpp_info_renewal_date()=" + getOpp_info_renewal_date()
				+ ", getBlock()=" + getBlock() + ", getTDS()=" + getTDS()
				+ ", getLender_ref()=" + getLender_ref()
				+ ", getSweat_equity_amount()=" + getSweat_equity_amount()
				+ ", getInternal_notes_final()=" + getInternal_notes_final()
				+ ", getSelected_product()=" + getSelected_product()
				+ ", getOther_amount()=" + getOther_amount()
				+ ", getWhat_is_your_lending_goal()="
				+ getWhat_is_your_lending_goal() + ", getProbability()="
				+ getProbability() + ", getBank_account()=" + getBank_account()
				+ ", getOpt_out()=" + getOpt_out() + ", getAcres()="
				+ getAcres() + ", getEstimated_valueof_home()="
				+ getEstimated_valueof_home() + ", getWater()=" + getWater()
				+ ", getTrigger()=" + getTrigger()
				+ ", getCurrent_interest_rate()=" + getCurrent_interest_rate()
				+ ", getCurrent_mortgage_type()=" + getCurrent_mortgage_type()
				+ ", getCash_back()=" + getCash_back() + ", getPlanned_cost()="
				+ getPlanned_cost() + ", getGifted_amount()="
				+ getGifted_amount() + ", getIs_rental_pools()="
				+ getIs_rental_pools() + ", getLiving_in_property()="
				+ getLiving_in_property() + ", getDown_payment_amount()="
				+ getDown_payment_amount() + ", getIs_fractional_interests()="
				+ getIs_fractional_interests()
				+ ", getProperty_less_then_5_years()="
				+ getProperty_less_then_5_years()
				+ ", getOpp_info_loan_amnt()=" + getOpp_info_loan_amnt()
				+ ", getPhone()=" + getPhone() + ", getWeb_response()="
				+ getWeb_response() + ", getApartment_style()="
				+ getApartment_style() + ", getMls()=" + getMls()
				+ ", getCurrent_renewal_date()=" + getCurrent_renewal_date()
				+ ", getType()=" + getType() + ", getIs_commercial()="
				+ getIs_commercial() + ", getDistance_to_major_center()="
				+ getDistance_to_major_center() + ", getFunction()="
				+ getFunction() + ", getAge()=" + getAge()
				+ ", getDate_open()=" + getDate_open() + ", getContact_name()="
				+ getContact_name() + ", getInternal_note()="
				+ getInternal_note() + ", getVolume_bonus_amount()="
				+ getVolume_bonus_amount() + ", getIs_construction_mortgage()="
				+ getIs_construction_mortgage() + ", getOpen_closed()="
				+ getOpen_closed() + ", getRef2()=" + getRef2()
				+ ", getDate_action_next()=" + getDate_action_next()
				+ ", getMaximum_amount()=" + getMaximum_amount()
				+ ", getTotal_one_time_fees()=" + getTotal_one_time_fees()
				+ ", getRenter_pay_heating()=" + getRenter_pay_heating()
				+ ", getState()=" + getState() + ", getId()=" + getId()
				+ ", getDownpayment_amount()=" + getDownpayment_amount()
				+ ", getRate()=" + getRate() + ", getBase_commission()="
				+ getBase_commission() + ", getInsurerfee()=" + getInsurerfee()
				+ ", getBuilding_funds()=" + getBuilding_funds()
				+ ", getStreet2()=" + getStreet2() + ", getZip()=" + getZip()
				+ ", getPreferred_number()=" + getPreferred_number()
				+ ", getCommitment_fee()=" + getCommitment_fee()
				+ ", getCredit_story()=" + getCredit_story()
				+ ", getReferred_source()=" + getReferred_source()
				+ ", getClosing_date()=" + getClosing_date()
				+ ", getMorweb_filogix()=" + getMorweb_filogix()
				+ ", getIs_eight_plex()=" + getIs_eight_plex()
				+ ", getInternal_notes()=" + getInternal_notes()
				+ ", getProperty_value()=" + getProperty_value()
				+ ", getPlan()=" + getPlan() + ", getDesired_amortization()="
				+ getDesired_amortization() + ", getTerm()=" + getTerm()
				+ ", getAddress()=" + getAddress() + ", getIs_six_plex()="
				+ getIs_six_plex() + ", getBorrowed_amount()="
				+ getBorrowed_amount() + ", getState_id()=" + getState_id()
				+ ", getDocument_fields()=" + getDocument_fields()
				+ ", getAssistant()=" + getAssistant()
				+ ", getCongrats_date()=" + getCongrats_date()
				+ ", getOpportunity_id()=" + getOpportunity_id()
				+ ", getTo_pages()=" + getTo_pages()
				+ ", getX_bypass_proposal()=" + getX_bypass_proposal()
				+ ", getDup_task_created()=" + getDup_task_created()
				+ ", getLooking_to()=" + getLooking_to()
				+ ", getClient_email_rem()=" + getClient_email_rem()
				+ ", getFinal_documents()=" + getFinal_documents()
				+ ", getProd_count()=" + getProd_count() + ", getDeadline()="
				+ getDeadline() + ", getCreate_uid()=" + getCreate_uid()
				+ ", getTraining_associate_referral()="
				+ getTraining_associate_referral() + ", getGreeting_send()="
				+ getGreeting_send() + ", getFax1()=" + getFax1()
				+ ", getRenewal_reminder()=" + getRenewal_reminder()
				+ ", getRef()=" + getRef() + ", getPayment_mode()="
				+ getPayment_mode() + ", getLead_followup_date()="
				+ getLead_followup_date() + ", getDesired_term()="
				+ getDesired_term() + ", getRenewal_email_send()="
				+ getRenewal_email_send() + ", getDelayed_app_date()="
				+ getDelayed_app_date() + ", getX_selected_recommendation()="
				+ getX_selected_recommendation() + ", getReferral_fee()="
				+ getReferral_fee() + ", getCompany_id()=" + getCompany_id()
				+ ", getFrequency()=" + getFrequency() + ", getTrainee()="
				+ getTrainee() + ", getUser_id()=" + getUser_id()
				+ ", getPropsal_date()=" + getPropsal_date()
				+ ", getPrivate_fee()=" + getPrivate_fee()
				+ ", getNew_opp_users()=" + getNew_opp_users()
				+ ", getVolume_commission()=" + getVolume_commission()
				+ ", getPost_selection()=" + getPost_selection()
				+ ", getLead_followed()=" + getLead_followed()
				+ ", getAll_email_ids()=" + getAll_email_ids()
				+ ", getWebform_uname()=" + getWebform_uname()
				+ ", getTemplate_date()=" + getTemplate_date()
				+ ", getIs_uninsured_conv_2nd_home()="
				+ getIs_uninsured_conv_2nd_home() + ", getRenewal_mail_date()="
				+ getRenewal_mail_date() + ", getChannel_id()="
				+ getChannel_id() + ", getStage_id()=" + getStage_id()
				+ ", getTitle()=" + getTitle() + ", getNeeds_power_attorney()="
				+ getNeeds_power_attorney() + ", getCountry_id()="
				+ getCountry_id() + ", getCurrent_mortgage_product()="
				+ getCurrent_mortgage_product() + ", getX_base_ltv()="
				+ getX_base_ltv() + ", getType_id()=" + getType_id()
				+ ", getSales_associate()=" + getSales_associate()
				+ ", getLooking_fora()=" + getLooking_fora()
				+ ", getWebform_pwd()=" + getWebform_pwd()
				+ ", getDelayed_app_task()=" + getDelayed_app_task()
				+ ", getUnderwriter()=" + getUnderwriter()
				+ ", getX_company()=" + getX_company()
				+ ", getHr_department_id()=" + getHr_department_id()
				+ ", getExisting_payout_penalty()="
				+ getExisting_payout_penalty() + ", getWrite_uid()="
				+ getWrite_uid() + ", getSection_id()=" + getSection_id()
				+ ", getCurrent_lender_moved0()=" + getCurrent_lender_moved0()
				+ ", getDate_renewed()=" + getDate_renewed() + ", getLawyer()="
				+ getLawyer() + ", getCompleted_ref()=" + getCompleted_ref()
				+ ", getAll_product_clicked()=" + getAll_product_clicked()
				+ ", getTask_created()=" + getTask_created()
				+ ", getFrom_web_form()=" + getFrom_web_form()
				+ ", getFrom_pages()=" + getFrom_pages()
				+ ", getPlus_minus_prime()=" + getPlus_minus_prime()
				+ ", getConsidered_cites()=" + getConsidered_cites()
				+ ", getWelcum_email_date()=" + getWelcum_email_date()
				+ ", getClient_remd()=" + getClient_remd()
				+ ", getDesired_amortization_moved1()="
				+ getDesired_amortization_moved1()
				+ ", getDesired_amortization_moved0()="
				+ getDesired_amortization_moved0() + ", getClient_survey()="
				+ getClient_survey() + ", getAmortization()="
				+ getAmortization() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}