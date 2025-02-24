/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "J2540ITIS"
 * 	found in "asn/J2540-2-J2540ITIS-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_SpecialEvents_H_
#define	_SpecialEvents_H_


#include "asn_application.h"

/* Including external dependencies */
#include "NativeInteger.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum SpecialEvents {
	SpecialEvents_major_event	= 3841,
	SpecialEvents_airshow	= 3842,
	SpecialEvents_hot_air_ballooning	= 3843,
	SpecialEvents_concert	= 3844,
	SpecialEvents_state_occasion	= 3845,
	SpecialEvents_vIP_visit	= 3846,
	SpecialEvents_show	= 3847,
	SpecialEvents_festival	= 3848,
	SpecialEvents_exhibition	= 3849,
	SpecialEvents_performing_arts	= 3850,
	SpecialEvents_outdoor_market	= 3851,
	SpecialEvents_fair	= 3852,
	SpecialEvents_carnival	= 3853,
	SpecialEvents_fireworks_display	= 3854,
	SpecialEvents_trade_expo	= 3855,
	SpecialEvents_movie_filming	= 3856,
	SpecialEvents_presidential_visit	= 3857,
	SpecialEvents_parade	= 3858,
	SpecialEvents_procession	= 3859,
	SpecialEvents_funeral_procession	= 3860,
	SpecialEvents_crowd	= 3861,
	SpecialEvents_holiday_traffic_crowds	= 3862,
	SpecialEvents_event_ended	= 3967
} e_SpecialEvents;

/* SpecialEvents */
typedef long	 SpecialEvents_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_SpecialEvents_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_SpecialEvents;
asn_struct_free_f SpecialEvents_free;
asn_struct_print_f SpecialEvents_print;
asn_constr_check_f SpecialEvents_constraint;
ber_type_decoder_f SpecialEvents_decode_ber;
der_type_encoder_f SpecialEvents_encode_der;
xer_type_decoder_f SpecialEvents_decode_xer;
xer_type_encoder_f SpecialEvents_encode_xer;
jer_type_encoder_f SpecialEvents_encode_jer;
oer_type_decoder_f SpecialEvents_decode_oer;
oer_type_encoder_f SpecialEvents_encode_oer;
per_type_decoder_f SpecialEvents_decode_uper;
per_type_encoder_f SpecialEvents_encode_uper;
per_type_decoder_f SpecialEvents_decode_aper;
per_type_encoder_f SpecialEvents_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _SpecialEvents_H_ */
#include "asn_internal.h"
