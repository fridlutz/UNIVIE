package wikiSampleSolution.main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import wikiSampleSolution.wikiSampleSolution.application.view.ViewManagement;

import wikiSampleSolution.wikiSampleSolution.WikiSampleSolutionFactory;
import wikiSampleSolution.wikiSampleSolution.Article;
import wikiSampleSolution.wikiSampleSolution.Wiki;
import wikiSampleSolution.wikiSampleSolution.History;
import wikiSampleSolution.wikiSampleSolution.RegisteredUser;
import wikiSampleSolution.wikiSampleSolution.Role;
import wikiSampleSolution.wikiSampleSolution.RoleType;
import wikiSampleSolution.wikiSampleSolution.User;
import wikiSampleSolution.wikiSampleSolution.Version;

import wikiSampleSolution.wikiSampleSolution.application.controller.ControllerManagement;

public class JSONAray extends JSONObject{
	
	private List<JSONObject> json_objects=new ArrayList<JSONObject>();
	
	public void addJSONobject(JSONObject json_obj)
	{
		this.json_objects.add(json_obj);
	}
}
