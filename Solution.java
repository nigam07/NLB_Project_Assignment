package com.solution;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

	public static List<Venue> readJSONFile() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Venue> venueList = objectMapper
				.readValue(
						new File("/Users/atulnigam/Documents/workspace-spring-tool-suite-4-4.18.0.RELEASE"
								+ "/NLB_Project_Assignment/src/main/resources/venues.json"),
						new TypeReference<List<Venue>>() {
						});

		return venueList;

	}

	public static Map<String, String> getEligibleVenues(List<Venue> venueList) {

		Map<String, String> venueMap = new LinkedHashMap<String, String>();

		List<Venue> filteredVenueList = venueList.stream()
				.filter(venue -> venue.getCapacity() <= 15000 && venue.getMinimum_tour_duration_in_days() <= 3)
				.collect(Collectors.toList());

		filteredVenueList = filteredVenueList.stream().sorted(Comparator.comparing(Venue::getCapacity).reversed())
				.collect(Collectors.toList());

		for (Venue venue : filteredVenueList) {

			if (venueMap.containsKey(venue.getCity())) {
				continue;
			} else {
				venueMap.put(venue.getCity(), venue.getId());
			}

		}

		System.out.println("Total Number of cities :: " + venueList.size());
		System.out.println("Total Eligible Cities :: " + venueMap.size());

		return venueMap;

	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		List<Venue> venueList = readJSONFile();
		Map<String, String> resultMap;
		resultMap = getEligibleVenues(venueList);
		System.out.println(resultMap);

	}

}
