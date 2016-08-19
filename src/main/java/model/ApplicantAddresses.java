package model;

public class ApplicantAddresses {
	private int unit;
	private String applicant_id;
    private String write_uid;
    private String create_uid;
    private String street;
    private String equifax_addr;
    private String date;
    private String write_date;
    private String city;
    private String id;
    private String create_date;
    private String name;
    private String postal_code;
    private String province;
    
    public String getApplicant_id ()
    {
        return applicant_id;
    }

    public void setApplicant_id (String applicant_id)
    {
        this.applicant_id = applicant_id;
    }

    public String getWrite_uid ()
    {
        return write_uid;
    }

    public void setWrite_uid (String write_uid)
    {
        this.write_uid = write_uid;
    }

    public String getCreate_uid ()
    {
        return create_uid;
    }

    public void setCreate_uid (String create_uid)
    {
        this.create_uid = create_uid;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getEquifax_addr ()
    {
        return equifax_addr;
    }

    public void setEquifax_addr (String equifax_addr)
    {
        this.equifax_addr = equifax_addr;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getWrite_date ()
    {
        return write_date;
    }

    public void setWrite_date (String write_date)
    {
        this.write_date = write_date;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCreate_date ()
    {
        return create_date;
    }

    public void setCreate_date (String create_date)
    {
        this.create_date = create_date;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPostal_code ()
    {
        return postal_code;
    }

    public void setPostal_code (String postal_code)
    {
        this.postal_code = postal_code;
    }

    public String getProvince ()
    {
        return province;
    }

    public void setProvince (String province)
    {
        this.province = province;
    }
    public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "ApplicantAddresses [unit=" + unit + ", applicant_id="
				+ applicant_id + ", write_uid=" + write_uid + ", create_uid="
				+ create_uid + ", street=" + street + ", equifax_addr="
				+ equifax_addr + ", date=" + date + ", write_date="
				+ write_date + ", city=" + city + ", id=" + id
				+ ", create_date=" + create_date + ", name=" + name
				+ ", postal_code=" + postal_code + ", province=" + province
				+ "]";
	}

	
}
