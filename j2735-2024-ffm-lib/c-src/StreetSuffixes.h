/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_StreetSuffixes_H_
#define	_StreetSuffixes_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum StreetSuffixes {
	StreetSuffixes_alley	= 13313,
	StreetSuffixes_annex	= 13314,
	StreetSuffixes_arcade	= 13315,
	StreetSuffixes_avenue	= 13316,
	StreetSuffixes_bayoo	= 13317,
	StreetSuffixes_beach	= 13318,
	StreetSuffixes_bend	= 13319,
	StreetSuffixes_bluff	= 13320,
	StreetSuffixes_bottom	= 13321,
	StreetSuffixes_boulevard	= 13322,
	StreetSuffixes_branch	= 13323,
	StreetSuffixes_nBridge	= 13324,
	StreetSuffixes_brook	= 13325,
	StreetSuffixes_burg	= 13326,
	StreetSuffixes_bypass	= 13327,
	StreetSuffixes_camp	= 13328,
	StreetSuffixes_canyon	= 13329,
	StreetSuffixes_cape	= 13330,
	StreetSuffixes_causeway	= 13331,
	StreetSuffixes_nCenter	= 13332,
	StreetSuffixes_circle	= 13333,
	StreetSuffixes_cliff	= 13334,
	StreetSuffixes_club	= 13335,
	StreetSuffixes_common	= 13336,
	StreetSuffixes_corner	= 13337,
	StreetSuffixes_course	= 13338,
	StreetSuffixes_court	= 13339,
	StreetSuffixes_cove	= 13340,
	StreetSuffixes_creek	= 13341,
	StreetSuffixes_crescent	= 13342,
	StreetSuffixes_crest	= 13343,
	StreetSuffixes_nCrossing	= 13344,
	StreetSuffixes_crossroad	= 13345,
	StreetSuffixes_curve	= 13346,
	StreetSuffixes_dale	= 13347,
	StreetSuffixes_nDam	= 13348,
	StreetSuffixes_divide	= 13349,
	StreetSuffixes_drive	= 13350,
	StreetSuffixes_estate	= 13351,
	StreetSuffixes_expressway	= 13352,
	StreetSuffixes_extension	= 13353,
	StreetSuffixes_fall	= 13354,
	StreetSuffixes_nFerry	= 13355,
	StreetSuffixes_field	= 13356,
	StreetSuffixes_flat	= 13357,
	StreetSuffixes_ford	= 13358,
	StreetSuffixes_forest	= 13359,
	StreetSuffixes_forge	= 13360,
	StreetSuffixes_fork	= 13361,
	StreetSuffixes_fort	= 13362,
	StreetSuffixes_nFreeway	= 13363,
	StreetSuffixes_garden	= 13364,
	StreetSuffixes_gateway	= 13365,
	StreetSuffixes_glen	= 13366,
	StreetSuffixes_green	= 13367,
	StreetSuffixes_grove	= 13368,
	StreetSuffixes_harbor	= 13369,
	StreetSuffixes_haven	= 13370,
	StreetSuffixes_heights	= 13371,
	StreetSuffixes_highway	= 13372,
	StreetSuffixes_nHill	= 13373,
	StreetSuffixes_hollow	= 13374,
	StreetSuffixes_inlet	= 13375,
	StreetSuffixes_nIsland	= 13376,
	StreetSuffixes_isle	= 13377,
	StreetSuffixes_nJunction	= 13378,
	StreetSuffixes_key	= 13379,
	StreetSuffixes_knoll	= 13380,
	StreetSuffixes_lake	= 13381,
	StreetSuffixes_land	= 13382,
	StreetSuffixes_landing	= 13383,
	StreetSuffixes_nLane	= 13384,
	StreetSuffixes_light	= 13385,
	StreetSuffixes_loaf	= 13386,
	StreetSuffixes_lock	= 13387,
	StreetSuffixes_lodge	= 13388,
	StreetSuffixes_loop	= 13389,
	StreetSuffixes_mall	= 13390,
	StreetSuffixes_manor	= 13391,
	StreetSuffixes_meadow	= 13392,
	StreetSuffixes_mews	= 13393,
	StreetSuffixes_mill	= 13394,
	StreetSuffixes_mission	= 13395,
	StreetSuffixes_motorway	= 13396,
	StreetSuffixes_mount	= 13397,
	StreetSuffixes_mountain	= 13398,
	StreetSuffixes_neck	= 13399,
	StreetSuffixes_orchard	= 13400,
	StreetSuffixes_oval	= 13401,
	StreetSuffixes_nOverpass	= 13402,
	StreetSuffixes_park	= 13403,
	StreetSuffixes_parkway	= 13404,
	StreetSuffixes_nPass	= 13405,
	StreetSuffixes_passage	= 13406,
	StreetSuffixes_path	= 13407,
	StreetSuffixes_pike	= 13408,
	StreetSuffixes_pine	= 13409,
	StreetSuffixes_plains	= 13410,
	StreetSuffixes_plaza	= 13411,
	StreetSuffixes_point	= 13412,
	StreetSuffixes_port	= 13413,
	StreetSuffixes_prairie	= 13414,
	StreetSuffixes_radial	= 13415,
	StreetSuffixes_ramp	= 13416,
	StreetSuffixes_ranch	= 13417,
	StreetSuffixes_rapid	= 13418,
	StreetSuffixes_rest	= 13419,
	StreetSuffixes_ridge	= 13420,
	StreetSuffixes_river	= 13421,
	StreetSuffixes_nRoad	= 13422,
	StreetSuffixes_route	= 13423,
	StreetSuffixes_row	= 13424,
	StreetSuffixes_rue	= 13425,
	StreetSuffixes_run	= 13426,
	StreetSuffixes_shoal	= 13427,
	StreetSuffixes_shore	= 13428,
	StreetSuffixes_skyway	= 13429,
	StreetSuffixes_spring	= 13430,
	StreetSuffixes_nSpur	= 13431,
	StreetSuffixes_square	= 13432,
	StreetSuffixes_nStation	= 13433,
	StreetSuffixes_stravenue	= 13434,
	StreetSuffixes_stream	= 13435,
	StreetSuffixes_street	= 13436,
	StreetSuffixes_summit	= 13437,
	StreetSuffixes_terrace	= 13438,
	StreetSuffixes_throughway	= 13439,
	StreetSuffixes_trace	= 13440,
	StreetSuffixes_nTrack	= 13441,
	StreetSuffixes_trafficway	= 13442,
	StreetSuffixes_nTrail	= 13443,
	StreetSuffixes_nTunnel	= 13444,
	StreetSuffixes_turnpike	= 13445,
	StreetSuffixes_nUnderpass	= 13446,
	StreetSuffixes_union	= 13447,
	StreetSuffixes_valley	= 13448,
	StreetSuffixes_viaduct	= 13449,
	StreetSuffixes_view	= 13450,
	StreetSuffixes_village	= 13451,
	StreetSuffixes_ville	= 13452,
	StreetSuffixes_vista	= 13453,
	StreetSuffixes_nWalk	= 13454,
	StreetSuffixes_wall	= 13455,
	StreetSuffixes_way	= 13456,
	StreetSuffixes_well	= 13457
} e_StreetSuffixes;

/* StreetSuffixes */
typedef long	 StreetSuffixes_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_StreetSuffixes;
asn_struct_free_f StreetSuffixes_free;
asn_struct_print_f StreetSuffixes_print;
asn_constr_check_f StreetSuffixes_constraint;
ber_type_decoder_f StreetSuffixes_decode_ber;
der_type_encoder_f StreetSuffixes_encode_der;
xer_type_decoder_f StreetSuffixes_decode_xer;
xer_type_encoder_f StreetSuffixes_encode_xer;
jer_type_encoder_f StreetSuffixes_encode_jer;
oer_type_decoder_f StreetSuffixes_decode_oer;
oer_type_encoder_f StreetSuffixes_encode_oer;
per_type_decoder_f StreetSuffixes_decode_uper;
per_type_encoder_f StreetSuffixes_encode_uper;
per_type_decoder_f StreetSuffixes_decode_aper;
per_type_encoder_f StreetSuffixes_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _StreetSuffixes_H_ */
#include "asn_internal.h"
