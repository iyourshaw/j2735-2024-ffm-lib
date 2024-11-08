/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "ITIS"
 * 	found in "asn/J2735-ITIS-2024-rel-v1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ITIS_GenericLocations_H_
#define	_ITIS_GenericLocations_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeEnumerated.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ITIS_GenericLocations {
	ITIS_GenericLocations_on_bridges	= 7937,
	ITIS_GenericLocations_in_tunnels	= 7938,
	ITIS_GenericLocations_entering_or_leaving_tunnels	= 7939,
	ITIS_GenericLocations_on_ramps	= 7940,
	ITIS_GenericLocations_in_road_construction_area	= 7941,
	ITIS_GenericLocations_around_a_curve	= 7942,
	ITIS_GenericLocations_on_curve	= 8026,
	ITIS_GenericLocations_on_tracks	= 8009,
	ITIS_GenericLocations_in_street	= 8025,
	ITIS_GenericLocations_shoulder	= 8027,
	ITIS_GenericLocations_on_minor_roads	= 7943,
	ITIS_GenericLocations_in_the_opposing_lanes	= 7944,
	ITIS_GenericLocations_adjacent_to_roadway	= 7945,
	ITIS_GenericLocations_across_tracks	= 8024,
	ITIS_GenericLocations_on_bend	= 7946,
	ITIS_GenericLocations_intersection	= 8032,
	ITIS_GenericLocations_entire_intersection	= 7947,
	ITIS_GenericLocations_in_the_median	= 7948,
	ITIS_GenericLocations_moved_to_side_of_road	= 7949,
	ITIS_GenericLocations_moved_to_shoulder	= 7950,
	ITIS_GenericLocations_on_the_roadway	= 7951,
	ITIS_GenericLocations_dip	= 8010,
	ITIS_GenericLocations_traffic_circle	= 8011,
	ITIS_GenericLocations_crossover	= 8028,
	ITIS_GenericLocations_cross_road	= 8029,
	ITIS_GenericLocations_side_road	= 8030,
	ITIS_GenericLocations_to	= 8014,
	ITIS_GenericLocations_by	= 8015,
	ITIS_GenericLocations_through	= 8016,
	ITIS_GenericLocations_area_of	= 8017,
	ITIS_GenericLocations_under	= 8018,
	ITIS_GenericLocations_over	= 8019,
	ITIS_GenericLocations_from	= 8020,
	ITIS_GenericLocations_approaching	= 8021,
	ITIS_GenericLocations_entering_at	= 8022,
	ITIS_GenericLocations_exiting_at	= 8023,
	ITIS_GenericLocations_in_shaded_areas	= 7952,
	ITIS_GenericLocations_in_low_lying_areas	= 7953,
	ITIS_GenericLocations_in_the_downtown_area	= 7954,
	ITIS_GenericLocations_in_the_inner_city_area	= 7955,
	ITIS_GenericLocations_in_parts	= 7956,
	ITIS_GenericLocations_in_some_places	= 7957,
	ITIS_GenericLocations_in_the_ditch	= 7958,
	ITIS_GenericLocations_in_the_valley	= 7959,
	ITIS_GenericLocations_on_hill_top	= 7960,
	ITIS_GenericLocations_near_the_foothills	= 7961,
	ITIS_GenericLocations_at_high_altitudes	= 7962,
	ITIS_GenericLocations_near_the_lake	= 7963,
	ITIS_GenericLocations_near_the_shore	= 7964,
	ITIS_GenericLocations_nearby_basin	= 8008,
	ITIS_GenericLocations_over_the_crest_of_a_hill	= 7965,
	ITIS_GenericLocations_other_than_on_the_roadway	= 7966,
	ITIS_GenericLocations_near_the_beach	= 7967,
	ITIS_GenericLocations_near_beach_access_point	= 7968,
	ITIS_GenericLocations_mountain_pass	= 8006,
	ITIS_GenericLocations_lower_level	= 7969,
	ITIS_GenericLocations_upper_level	= 7970,
	ITIS_GenericLocations_airport	= 7971,
	ITIS_GenericLocations_concourse	= 7972,
	ITIS_GenericLocations_gate	= 7973,
	ITIS_GenericLocations_baggage_claim	= 7974,
	ITIS_GenericLocations_customs_point	= 7975,
	ITIS_GenericLocations_reservation_center	= 8007,
	ITIS_GenericLocations_station	= 7976,
	ITIS_GenericLocations_platform	= 7977,
	ITIS_GenericLocations_dock	= 7978,
	ITIS_GenericLocations_depot	= 7979,
	ITIS_GenericLocations_ev_charging_point	= 7980,
	ITIS_GenericLocations_information_welcome_point	= 7981,
	ITIS_GenericLocations_at_rest_area	= 7982,
	ITIS_GenericLocations_at_service_area	= 7983,
	ITIS_GenericLocations_at_weigh_station	= 7984,
	ITIS_GenericLocations_roadside_park	= 8033,
	ITIS_GenericLocations_picnic_areas	= 7985,
	ITIS_GenericLocations_rest_area	= 7986,
	ITIS_GenericLocations_service_stations	= 7987,
	ITIS_GenericLocations_toilets	= 7988,
	ITIS_GenericLocations_bus_stop	= 8031,
	ITIS_GenericLocations_park_and_ride_lot	= 8012,
	ITIS_GenericLocations_on_the_right	= 7989,
	ITIS_GenericLocations_on_the_left	= 7990,
	ITIS_GenericLocations_in_the_center	= 7991,
	ITIS_GenericLocations_in_the_opposite_direction	= 7992,
	ITIS_GenericLocations_cross_traffic	= 7993,
	ITIS_GenericLocations_northbound_traffic	= 7994,
	ITIS_GenericLocations_eastbound_traffic	= 7995,
	ITIS_GenericLocations_southbound_traffic	= 7996,
	ITIS_GenericLocations_westbound_traffic	= 7997,
	ITIS_GenericLocations_north	= 7998,
	ITIS_GenericLocations_south	= 7999,
	ITIS_GenericLocations_east	= 8000,
	ITIS_GenericLocations_west	= 8001,
	ITIS_GenericLocations_northeast	= 8002,
	ITIS_GenericLocations_northwest	= 8003,
	ITIS_GenericLocations_southeast	= 8004,
	ITIS_GenericLocations_southwest	= 8005
	/*
	 * Enumeration is extensible
	 */
} e_ITIS_GenericLocations;

/* ITIS_GenericLocations */
typedef long	 ITIS_GenericLocations_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_ITIS_GenericLocations_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_ITIS_GenericLocations;
extern const asn_INTEGER_specifics_t asn_SPC_ITIS_GenericLocations_specs_1;
asn_struct_free_f ITIS_GenericLocations_free;
asn_struct_print_f ITIS_GenericLocations_print;
asn_constr_check_f ITIS_GenericLocations_constraint;
ber_type_decoder_f ITIS_GenericLocations_decode_ber;
der_type_encoder_f ITIS_GenericLocations_encode_der;
xer_type_decoder_f ITIS_GenericLocations_decode_xer;
xer_type_encoder_f ITIS_GenericLocations_encode_xer;
jer_type_encoder_f ITIS_GenericLocations_encode_jer;
oer_type_decoder_f ITIS_GenericLocations_decode_oer;
oer_type_encoder_f ITIS_GenericLocations_encode_oer;
per_type_decoder_f ITIS_GenericLocations_decode_uper;
per_type_encoder_f ITIS_GenericLocations_encode_uper;
per_type_decoder_f ITIS_GenericLocations_decode_aper;
per_type_encoder_f ITIS_GenericLocations_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _ITIS_GenericLocations_H_ */
#include "asn_internal.h"
