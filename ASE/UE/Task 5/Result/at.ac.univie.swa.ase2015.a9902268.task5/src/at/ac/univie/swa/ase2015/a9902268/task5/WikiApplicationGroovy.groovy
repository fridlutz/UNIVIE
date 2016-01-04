package at.ac.univie.swa.ase2015.a9902268.task5

import java.awt.event.MouseListener

import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.TreePath;

import at.ac.univie.swa.ase2015.a9902268.task1.application.WikiApplicationUI

wikiapplication = new WikiApplicationUI()
wikiapplication.setVisible(true)

def clickCount = [:]

//listen to double clicks on articles
wikiapplication.tree.mouseClicked = { event ->
	TreePath selPath = wikiapplication.tree.getPathForLocation(event.getX(), event.getY());
	if (selPath != null) {
		if (event.getClickCount() == 2) {
			DefaultMutableTreeNode node = ((DefaultMutableTreeNode) selPath.getLastPathComponent());
			if (node.isLeaf() && node.getParent().equals(wikiapplication.article)) {
				//implement view counter logic, increment count or initialize
				if (clickCount.get(selPath.getLastPathComponent()) != null) {
					clickCount.put(selPath.getLastPathComponent(), clickCount.get(selPath.getLastPathComponent()) + 1)
				}
				else {
					clickCount.put(selPath.getLastPathComponent(), 1)
				}
				//sort map, highest count first and print the map
				clickCount = clickCount.sort{-it.value}
				println "########################################################"
				println "VIEW COUNT WIKIPEDIA (sorted from most to least popular)"
				println "########################################################"

				def counter = 1
				clickCount.each { pageName, pageCount->
					if (counter < 6) {
						println "Rank ${counter}:  ${pageName} with ${pageCount} view(s)"
					}
					counter++
				}
			}

		}
	}

}

