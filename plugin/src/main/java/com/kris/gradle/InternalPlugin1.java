package com.kris.gradle;

import org.apache.commons.lang3.StringUtils;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;

class InternalPlugin1 implements Plugin<Project> {
	
	@Override
	public void apply(final Project project) {
//        System.out.println("Applying InternalPlugin1... ");
		final TaskContainer tasks = project.getTasks();
		
		tasks.register("internal1", task -> {
			System.out.println("========== Result: " + StringUtils.capitalize("internal-plugin1"));
		});
	}
	
}
