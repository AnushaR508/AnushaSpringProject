package com.cg.TimeCardApplication;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import com.cg.leavemanagement.controller.EmployeeLeaveDetailsController;
import com.cg.leavemanagement.model.EmployeeLeaveDetailsEntity;
import com.cg.leavemanagement.model.HolidaysEntity;
import com.cg.leavemanagement.service.EmployeeLeaveDetailsServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootConfiguration
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//@WebMvcTest
//@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(locations= {"classpath:app-context.xml"})
//@WebAppConfiguration
public class LeaveTest {
	// @Autowired
	// private MockMvc mockMvc;
	 //MockMvcBuilders.standaloneSetup(new EmployeeLeaveDetailsController());
	 
	 //@Before(value = "")
	// public void setUp()
	// {
	//	 mockMvc=MockMvcBuilders.standaloneSetup(new EmployeeLeaveDetailsController());
	// }*/
		 
	     @Autowired
		private EmployeeLeaveDetailsServiceImpl leaveservice;
		//=mock(EmployeeLeaveDetailsServiceImpl.class);
		
		private static ObjectMapper mapper = new ObjectMapper();
		/*@Test
	    public void testpostExample() throws Exception {
	        LocalDate startdate=LocalDate.of(2020, 12, 12);
	        LocalDate enddate=LocalDate.of(2020, 12, 16);
			EmployeeLeaveDetailsEntity leave = new EmployeeLeaveDetailsEntity(46046012,"abc",2,"sick", startdate,enddate, 24, 0, 0, 0, 0);
	        Mockito.when(leaveservice.addEmployee(ArgumentMatchers.any())).thenReturn(leave);
	        String json = mapper.writeValueAsString(leave);
	        Period diff=Period.between(leave.getStartDate(), leave.getEndDate());
		    int debit=diff.getDays();
			int available=24-debit;
			leave.setLeaveDebit(debit);
			leave.setLeaveAvailable(available);
	        mockMvc.perform(post("/leave/insert").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
	                .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isCreated())
	                .andExpect(jsonPath("$.empId", Matchers.equalTo(46046012)))
	                .andExpect(jsonPath("$.empName", Matchers.equalTo("abc")))
	                .andExpect(jsonPath("$.leaveId", Matchers.equalTo(2)))
	                .andExpect(jsonPath("$.leaveType", Matchers.equalTo("sick")))
	        		.andExpect(jsonPath("$.startDate", Matchers.equalTo(startdate)))
	        		.andExpect(jsonPath("$.endDate", Matchers.equalTo(enddate)))
	        		.andExpect(jsonPath("$.leaveAvailable", Matchers.equalTo(available)))
	        		.andExpect(jsonPath("$.leaveDebit", Matchers.equalTo(0)))
	        		.andExpect(jsonPath("$.leaveCredit", Matchers.equalTo(0)))
	        		.andExpect(jsonPath("$.leaveApplied", Matchers.equalTo(0)))
	        		.andExpect(jsonPath("$.leaveCancelled", Matchers.equalTo(0)));
	        		
	    }*/
		
		@Test
	    public void testGetExample() throws Exception {
	        List<HolidaysEntity> hol= new ArrayList<>();
	        HolidaysEntity holiday = new  HolidaysEntity(1,2020,"01 Jan 2020","NewYear");
	        hol.add(holiday);
	        List<HolidaysEntity> holi=leaveservice.viewHolidayList(2020);
	        int len=holi.size();
	        assertEquals(len,1);
	       //when(leaveservice.viewHolidayList(2020)).thenReturn(hol);
	     //   mockMvc.perform(get("/holidaylist/2020")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(1)))
	               // .andExpect(jsonPath("$[2].description", Matchers.equalTo("NewYear")));

		}
}



	

