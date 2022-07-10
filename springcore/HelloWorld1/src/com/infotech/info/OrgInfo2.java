package com.infotech.info;
import java.util.List;
import java.util.Set;

public class OrgInfo2 {

	private String namesArr[] = new String[2];
	private List<String> empNameList;
	private Set<Integer> empIdsSet;
	
	public String[] getNamesArr() {
		return namesArr;
	}
	public void setNamesArr(String[] namesArr) {
		this.namesArr = namesArr;
	}
	public List<String> getEmpNameList() {
		return empNameList;
	}
	public void setEmpNameList(List<String> empNameList) {
		this.empNameList = empNameList;
	}
	public Set<Integer> getEmpIdsSet() {
		return empIdsSet;
	}
	public void setEmpIdsSet(Set<Integer> empIdsSet) {
		this.empIdsSet = empIdsSet;
	}
}