(: 
This file was generated by Altova MapForce 2015r3sp1

YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.

Refer to the Altova MapForce Documentation for further details.
http://www.altova.com/mapforce
 :)

xquery version "1.0";

declare default order empty least;
declare namespace ns0 = 'http://www.univie.ac.at/Interop';
declare namespace xs = 'http://www.w3.org/2001/XMLSchema';
declare namespace fn = 'http://www.w3.org/2005/xpath-functions';
<studies xmlns="http://www.univie.ac.at/Interop">
	{
	(
		attribute xsi:schemaLocation
			{
			'http://www.univie.ac.at/Interop Z:/INTERROP/SESS~6B2/4SCH~A4D/xsd_gruppe_14_FIXED.xsd'
			},
		for $var8_current in ./studies
		return
			for $var7_current in $var8_current/study
			return
				<module>
					{
					(
						<name>
							{
							fn:string($var7_current/@name)
							}
						</name>,
						<id>
							{
							fn:string($var7_current/@id)
							}
						</id>,
						for $var6_current in $var7_current/course
						let $var1_resultof_cast := xs:string(xs:int(xs:long(xs:integer(xs:decimal(fn:string($var6_current/@id))))))
						return
							<course>
								{
								(
									<title>
										{
										fn:string($var6_current/@title)
										}
									</title>,
									<study_programme>
										{
										fn:string($var6_current/@responsible_unit)
										}
									</study_programme>,
									<type>
										{
										fn:string($var6_current/@type)
										}
									</type>,
									<id>
										{
										$var1_resultof_cast
										}
									</id>,
									<immanent>
										{
										fn:string($var6_current/@continousassessment)
										}
									</immanent>,
									<ects>
										{
										xs:float(fn:string($var6_current/@ects))
										}
									</ects>,
									<comment>
										{
										'NA'
										}
									</comment>,
									for $var5_current in $var6_current/group
									return
										<group>
											{
											(
												<id>
													{
													$var1_resultof_cast
													}
												</id>,
												<livestream>
													{
													fn:string($var5_current/@livestream)
													}
												</livestream>,
												<sign_language>
													{
													fn:string($var5_current/@signlanguage)
													}
												</sign_language>,
												<block>
													{
													fn:string($var5_current/@block)
													}
												</block>,
												<platform_link>
													{
													fn:string($var5_current/@learningplatformurl)
													}
												</platform_link>,
												for $var2_current in $var5_current/lecturer
												return
													<lecturer_first_name>
														{
														fn:string($var2_current/@givenname)
														}
													</lecturer_first_name>,
												for $var3_current in $var5_current/lecturer
												return
													<lecturer_last_name>
														{
														fn:string($var3_current/@name)
														}
													</lecturer_last_name>,
												<tests>
													{
													'NA'
													}
												</tests>,
												<exam>
													{
													'NA'
													}
												</exam>,
												for $var4_current in $var5_current/appointment
												return
													<group_details>
														{
														(
															<date>
																{
																fn:string($var4_current/@date)
																}
															</date>,
															<start_time>
																{
																xs:float(fn:string($var4_current/@start))
																}
															</start_time>,
															<end_time>
																{
																xs:float(fn:string($var4_current/@end))
																}
															</end_time>,
															<room>
																{
																fn:string($var4_current/@room)
																}
															</room>,
															<city>
																{
																fn:string($var4_current/@city)
																}
															</city>,
															<street>
																{
																fn:string($var4_current/@roomnumber)
																}
															</street>
														)
														}
													</group_details>
											)
											}
										</group>
								)
								}
							</course>
					)
					}
				</module>
	)
	}
</studies>
