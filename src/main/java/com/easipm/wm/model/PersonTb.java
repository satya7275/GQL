package com.easipm.wm.model;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.lang.reflect.Field;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;
 import javax.persistence.Id;
 import javax.persistence.Entity;
@Entity
@Table(name="PERSON_TB", schema="dbo" )
@Getter @Setter @RequiredArgsConstructor @AllArgsConstructor 
public class PersonTb  implements Serializable {

 private static final long serialVersionUID =1L;
 @Column(name="amb3_3")
	private Integer amb33;
 @Column(name="amb3_2")
	private Integer amb32;
 @Column(name="attr2_3")
	private Integer attr23;
 @Column(name="shar2_3")
	private Integer shar23;
 @Column(name="attr2_2")
	private Integer attr22;
 @Column(name="music")
	private Integer music;
 @Column(name="attr3_s")
	private Integer attr3S;
 @Column(name="attr2_1")
	private Integer attr21;
 @Column(name="dec_id")
	private Integer decId;
 @Column(name="amb3_1")
	private Integer amb31;
 @Column(name="shopping")
	private Integer shopping;
 @Column(name="condtn")
	private Integer condtn;
 @Column(name="dining")
	private Integer dining;
 @Column(name="sinc3_s")
	private Integer sinc3S;
 @Column(name="exphappy")
	private Integer exphappy;
 @Column(name="sinc2_1")
	private Integer sinc21;
 @Column(name="you_call")
	private Integer youCall;
 @Column(name="shar2_1")
	private Integer shar21;
 @Column(name="sinc2_3")
	private Integer sinc23;
 @Column(name="sinc2_2")
	private Integer sinc22;
 @Column(name="shar2_2")
	private Integer shar22;
 @Column(name="pf_o_int")
	private Integer pfOInt;
 @Column(name="order_id")
	private Integer orderId;
 @Column(name="tvsports")
	private Integer tvsports;
 @Column(name="amb3_s")
	private Integer amb3S;
 @Column(name="amb2_3")
	private Integer amb23;
 @Column(name="yoga")
	private Integer yoga;
 @Column(name="attr3_2")
	private Integer attr32;
 @Column(name="attr3_1")
	private Integer attr31;
 @Column(name="imprace")
	private Integer imprace;
 @Column(name="attr3_3")
	private Integer attr33;
 @Column(name="int_corr")
	private Integer intCorr;
 @Column(name="amb2_2")
	private Integer amb22;
 @Column(name="amb2_1")
	private Integer amb21;
 @Column(name="positin1")
	private Integer positin1;
 @Column(name="art")
	private Integer art;
 @Column(name="match_id")
	private Integer matchId;
 @Column(name="intel7_2")
	private Integer intel72;
 @Column(name="intel7_3")
	private Integer intel73;
 @Column(name="sinc3_3")
	private Integer sinc33;
 @Column(name="numdat_3")
	private Integer numdat3;
 @Column(name="numdat_2")
	private Integer numdat2;
 @Column(name="sinc3_2")
	private Integer sinc32;
 @Column(name="sinc3_1")
	private Integer sinc31;
 @Column(name="mn_sat")
	private String mnSat;
 @Column(name="partner")
	private Integer partner;
 @Column(name="fun5_2")
	private Integer fun52;
 @Column(name="fun5_1")
	private Integer fun51;
 @Column(name="career_c")
	private Integer careerC;
 @Column(name="fun_o")
	private Integer funO;
 @Column(name="fun5_3")
	private Integer fun53;
 @Column(name="amb5_3")
	private Integer amb53;
 @Column(name="amb5_2")
	private Integer amb52;
 @Column(name="pf_o_fun")
	private Integer pfOFun;
 @Column(name="tv")
	private Integer tv;
 @Column(name="amb5_1")
	private Integer amb51;
 @Column(name="race_o")
	private Integer raceO;
 @Column(name="attr4_1")
	private Integer attr41;
 @Column(name="round_id")
	private Integer roundId;
 @Column(name="attr4_3")
	private Integer attr43;
 @Column(name="museums")
	private Integer museums;
 @Column(name="attr4_2")
	private Integer attr42;
 @Column(name="like_id")
	private Integer likeId;
 @Column(name="age_o")
	private Integer ageO;
 @Column(name="sinc4_3")
	private Integer sinc43;
 @Column(name="sinc4_2")
	private Integer sinc42;
 @Column(name="idg")
	private Integer idg;
 @Column(name="sinc4_1")
	private Integer sinc41;
 @Column(name="shar1_s")
	private Integer shar1S;
 @Column(name="intel1_s")
	private Integer intel1S;
 @Column(name="fun1_s")
	private Integer fun1S;
 @Column(name="sinc")
	private Integer sinc;
 @Column(name="income")
	private String income;
 @Column(name="amb4_3")
	private Integer amb43;
 @Column(name="dec_o")
	private Integer decO;
 @Column(name="amb4_2")
	private Integer amb42;
 @Column(name="amb4_1")
	private Integer amb41;
 @Column(name="satis_2")
	private Integer satis2;
 @Column(name="wave")
	private Integer wave;
 @Column(name="attr5_2")
	private Integer attr52;
 @Column(name="attr5_1")
	private Integer attr51;
 @Column(name="match_es")
	private Integer matchEs;
 @Column(name="attr5_3")
	private Integer attr53;
 @Column(name="met_o")
	private Integer metO;
 @Column(name="race")
	private Integer race;
 @Column(name="sinc5_2")
	private Integer sinc52;
 @Column(name="reading")
	private Integer reading;
 @Column(name="sinc5_1")
	private Integer sinc51;
 @Column(name="tuition")
	private String tuition;
 @Column(name="sinc5_3")
	private Integer sinc53;
 @Column(name="shar1_1")
	private Integer shar11;
 @Column(name="length_id")
	private Integer lengthId;
 @Column(name="shar1_2")
	private Integer shar12;
 @Column(name="shar1_3")
	private Integer shar13;
 @Column(name="intel1_1")
	private Integer intel11;
 @Column(name="intel1_2")
	private Integer intel12;
 @Column(name="intel1_3")
	private Integer intel13;
 @Column(name="pf_o_amb")
	private Integer pfOAmb;
 @Column(name="fun7_2")
	private Integer fun72;
 @Column(name="fun7_3")
	private Integer fun73;
 @Column(name="age")
	private Integer age;
 @Column(name="career")
	private String career;
 @Column(name="amb7_3")
	private Integer amb73;
 @Column(name="amb7_2")
	private Integer amb72;
 @Column(name="movies")
	private Integer movies;
 @Column(name="sinc7_3")
	private Integer sinc73;
 @Column(name="id")
	private Integer id;
 @Column(name="samerace")
	private Integer samerace;
 @Column(name="goal")
	private Integer goal;
 @Column(name="intel2_3")
	private Integer intel23;
 @Column(name="intel")
	private Integer intel;
 @Column(name="intel3_s")
	private Integer intel3S;
 @Column(name="intel2_1")
	private Integer intel21;
 @Column(name="intel2_2")
	private Integer intel22;
 @Column(name="field")
	private String field;
 @Column(name="fun2_1")
	private Integer fun21;
 @Column(name="fun2_3")
	private Integer fun23;
 @Column(name="fun2_2")
	private Integer fun22;
 @Column(name="fun3_s")
	private Integer fun3S;
 @Column(name="them_cal")
	private Integer themCal;
 @Column(name="from_id")
	private String fromId;
 @Column(name="gender")
	private Integer gender;
 @Id
 @Column(name="iid")
	private Integer iid;
 @Column(name="exercise")
	private Integer exercise;
 @Column(name="date_id")
	private Integer dateId;
 @Column(name="shar7_2")
	private Integer shar72;
 @Column(name="shar7_3")
	private Integer shar73;
 @Column(name="attr7_2")
	private Integer attr72;
 @Column(name="attr7_3")
	private Integer attr73;
 @Column(name="expnum")
	private Integer expnum;
 @Column(name="prob")
	private Integer prob;
 @Column(name="gaming")
	private Integer gaming;
 @Column(name="field_cd")
	private Integer fieldCd;
 @Column(name="hiking")
	private Integer hiking;
 @Column(name="sinc7_2")
	private Integer sinc72;
 @Column(name="intel3_2")
	private Integer intel32;
 @Column(name="intel3_3")
	private Integer intel33;
 @Column(name="intel3_1")
	private Integer intel31;
 @Column(name="shar")
	private Integer shar;
 @Column(name="fun1_2")
	private Integer fun12;
 @Column(name="fun1_1")
	private Integer fun11;
 @Column(name="fun1_3")
	private Integer fun13;
 @Column(name="go_out")
	private Integer goOut;
 @Column(name="fun")
	private Integer fun;
 @Column(name="like_o")
	private Integer likeO;
 @Column(name="sinc_o")
	private Integer sincO;
 @Column(name="pid")
	private Integer pid;
 @Column(name="shar4_1")
	private Integer shar41;
 @Column(name="attr1_s")
	private Integer attr1S;
 @Column(name="shar4_2")
	private Integer shar42;
 @Column(name="shar_o")
	private Integer sharO;
 @Column(name="shar4_3")
	private Integer shar43;
 @Column(name="theater")
	private Integer theater;
 @Column(name="clubbing")
	private Integer clubbing;
 @Column(name="prob_o")
	private Integer probO;
 @Column(name="amb1_3")
	private Integer amb13;
 @Column(name="amb1_2")
	private Integer amb12;
 @Column(name="amb1_1")
	private Integer amb11;
 @Column(name="intel4_1")
	private Integer intel41;
 @Column(name="intel4_2")
	private Integer intel42;
 @Column(name="intel4_3")
	private Integer intel43;
 @Column(name="amb_o")
	private Integer ambO;
 @Column(name="sinc1_s")
	private Integer sinc1S;
 @Column(name="zipcode")
	private String zipcode;
 @Column(name="concerts")
	private Integer concerts;
 @Column(name="fun4_1")
	private Integer fun41;
 @Column(name="amb")
	private Integer amb;
 @Column(name="fun4_3")
	private Integer fun43;
 @Column(name="fun4_2")
	private Integer fun42;
 @Column(name="position")
	private Integer position;
 @Column(name="attr_o")
	private Integer attrO;
 @Column(name="undergra")
	private String undergra;
 @Column(name="attr1_3")
	private Integer attr13;
 @Column(name="date_3")
	private Integer date3;
 @Column(name="num_in_3")
	private Integer numIn3;
 @Column(name="attr1_2")
	private Integer attr12;
 @Column(name="attr1_1")
	private Integer attr11;
 @Column(name="pf_o_sin")
	private Integer pfOSin;
 @Column(name="imprelig")
	private Integer imprelig;
 @Column(name="attr")
	private Integer attr;
 @Column(name="amb1_s")
	private Integer amb1S;
 @Column(name="met")
	private Integer met;
 @Column(name="sports")
	private Integer sports;
 @Column(name="pf_o_att")
	private Integer pfOAtt;
 @Column(name="sinc1_2")
	private Integer sinc12;
 @Column(name="sinc1_1")
	private Integer sinc11;
 @Column(name="intel5_1")
	private Integer intel51;
 @Column(name="intel5_2")
	private Integer intel52;
 @Column(name="sinc1_3")
	private Integer sinc13;
 @Column(name="intel5_3")
	private Integer intel53;
 @Column(name="intel_o")
	private Integer intelO;
 @Column(name="fun3_2")
	private Integer fun32;
 @Column(name="pf_o_sha")
	private Integer pfOSha;
 @Column(name="fun3_1")
	private Integer fun31;
 @Column(name="fun3_3")
	private Integer fun33;




}
