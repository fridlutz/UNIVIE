package gui

import gui.Application

a = new Application()

a.button.actionPerformed = { println "New Groovy click @ ${new Date()}" }