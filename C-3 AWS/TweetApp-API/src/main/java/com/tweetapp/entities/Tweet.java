package com.tweetapp.entities;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.tweetapp.dto.Comment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@DynamoDBTable(tableName = "tweets")
public class Tweet {
	
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	private String tweetId;
	
	@DynamoDBAttribute
	private String username;
	@DynamoDBAttribute
	private String tweetText;
	@DynamoDBAttribute
	private String firstName;
	@DynamoDBAttribute
	private String lastName;
	@DynamoDBAttribute
	private String tweetDate;
	@DynamoDBAttribute
	private List<String> likes = new ArrayList<>();
	@DynamoDBAttribute
	private List<Comment> comments = new ArrayList<>();
	
}
