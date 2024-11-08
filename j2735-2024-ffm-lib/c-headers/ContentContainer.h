/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "RoadSafetyMessage"
 * 	found in "asn/J2945-4-RoadSafetyMessage-2024-rel-v1.1.1.asn"
 * 	`asn1c -fcompound-names -fincludes-quoted -pdu=all`
 */

#ifndef	_ContentContainer_H_
#define	_ContentContainer_H_


#include "asn_application.h"

/* Including external dependencies */
#include "ReducedSpeedZoneContainer.h"
#include "LaneClosureContainer.h"
#include "CurveContainer.h"
#include "DynamicInfoContainer.h"
#include "IncidentsContainer.h"
#include "SituationalContainer.h"
#include "constr_CHOICE.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum ContentContainer_PR {
	ContentContainer_PR_NOTHING,	/* No components present */
	ContentContainer_PR_rszContainer,
	ContentContainer_PR_laneClosureContainer,
	ContentContainer_PR_curveContainer,
	ContentContainer_PR_dynamicInfoContainer,
	ContentContainer_PR_incidentsContainer,
	ContentContainer_PR_situationalContainer
	/* Extensions may appear below */
	
} ContentContainer_PR;

/* ContentContainer */
typedef struct ContentContainer {
	ContentContainer_PR present;
	union ContentContainer_u {
		ReducedSpeedZoneContainer_t	 rszContainer;
		LaneClosureContainer_t	 laneClosureContainer;
		CurveContainer_t	 curveContainer;
		DynamicInfoContainer_t	 dynamicInfoContainer;
		IncidentsContainer_t	 incidentsContainer;
		SituationalContainer_t	 situationalContainer;
		/*
		 * This type is extensible,
		 * possible extensions are below.
		 */
	} choice;
	
	/* Context for parsing across buffer boundaries */
	asn_struct_ctx_t _asn_ctx;
} ContentContainer_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_ContentContainer;
extern asn_CHOICE_specifics_t asn_SPC_ContentContainer_specs_1;
extern asn_TYPE_member_t asn_MBR_ContentContainer_1[6];
extern asn_per_constraints_t asn_PER_type_ContentContainer_constr_1;

#ifdef __cplusplus
}
#endif

#endif	/* _ContentContainer_H_ */
#include "asn_internal.h"
